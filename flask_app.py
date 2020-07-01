#start the process
import flask
import os.path
from flask import Flask,request,Response
import cv2
import tensorflow as tf
import os
import numpy as np
import werkzeug
import time

CATEGORIES1=["acne","Amelanotic","dermatitis","myxoid","ringworm"]
CATEGORIES2=["highwrinkles","lesswrinkles"]
def prepare(filepath):
    IMG_SIZE = 224# 50 in txt-based
    img_array = cv2.imread(filepath)  # read in the image, convert to grayscale
    img_array = img_array/255.0
    new_array = cv2.resize(img_array, (IMG_SIZE, IMG_SIZE))  # resize image to match model's expected sizing
    return new_array.reshape(-1, IMG_SIZE, IMG_SIZE, 3)  # return the image with shaping that TF wants.
model1 = tf.keras.models.load_model("diagnose.model")
model2 = tf.keras.models.load_model("young.model")




#api
app=Flask(__name__)

@app.route('/', methods = ['GET', 'POST'])
def handle_request():

    files_ids = list(flask.request.files)
    print("\nNumber of Received Images : ", len(files_ids))
    image_num = 1
    for file_id in files_ids:
        print("\nSaving Image ", str(image_num), "/", len(files_ids))
        imagefile = flask.request.files[file_id]
        filename = werkzeug.utils.secure_filename(imagefile.filename)
        print("Image Filename : " + imagefile.filename)

        timestr = time.strftime("%Y%m%d-%H%M%S")
        imagefile.save('test.jpg')

        image_num = image_num + 1

    if filename=='image':
        prediction = model1.predict([prepare('test.jpg')])
        result=CATEGORIES1[np.argmax(prediction,axis=1)[0]]
        print(result)
        print(max(prediction[0]))
        if(max(prediction[0]>0.80)):
            if result == "acne":
                return "acne"
            elif result == "Amelanotic":

                return "Amelanotic"
            elif result == "dermatitis":

                return "dermatitis"
            elif result == "myxoid":

                return "myxoid"
            elif result == "ringworm":

                return "ringworm"
        else:
            return "Fine"
    else:
        prediction = model2.predict([prepare('test.jpg')])
        result=CATEGORIES2[np.argmax(prediction,axis=1)[0]]
        print(result)
        print(max(prediction[0]))

        if result == "highwrinkles":
            return "Have patience and follow the tips"
        elif result == "lesswrinkles":

            return "You already look young"


app.run(host="0.0.0.0",port=5000,debug=True)
