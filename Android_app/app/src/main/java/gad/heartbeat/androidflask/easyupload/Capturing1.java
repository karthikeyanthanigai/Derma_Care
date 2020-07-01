package gad.heartbeat.androidflask.easyupload;

import android.content.Context;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class Capturing1 extends Fragment {
    ShowCamera showCamera;
    FrameLayout frameLayout ;
    Camera camera;
    Button takepic;
    Context context;
    String ipv4Address = "192.168.0.108";
    String portNumber = "5000";
    String postUrl = "http://" + ipv4Address + ":" + portNumber + "/";
    public String postBodyText = "default";
    MediaType mediaText = MediaType.parse("text/plain; charset=utf-8");
    MediaType mediaImage = MediaType.parse("image/*jpg");
    public String result = " ";

    private static final String TAG = "Capturing";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cap, container, false);

        FrameLayout frameLayout = (FrameLayout) v.findViewById(R.id.frameLayout);
        takepic = (Button) v.findViewById(R.id.takepic);

        camera = Camera.open();

        showCamera = new ShowCamera(getActivity(),camera);
        frameLayout.addView(showCamera);

        takepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                camera.takePicture(null, null,mPictureCallback);

            }
        });
        return v;
    }

    Camera.PictureCallback mPictureCallback = new Camera.PictureCallback() {
        @Override
        public void onPictureTaken(byte[] data, Camera camera) {
            RequestBody postBodyImage = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("image1", postBodyText, RequestBody.create(MediaType.parse("image/*jpg"), data))
                    .build();
            postRequest(postUrl, postBodyImage);



        }
    };

    void postRequest(String postUrl, RequestBody postBody) {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(postUrl)
                .post(postBody)
                .build();

        client.newCall(request).enqueue(new Callback()


        {
            @Override
            public void onFailure(Call call, IOException e) {
                // Cancel the post on failure.
                call.cancel();
                Log.d("FAIL", e.getMessage());

                // In order to access the TextView inside the UI thread, the code is executed inside runOnUiThread()
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        timer.setText("fail");
//                    }
//                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {

                result = response.body().string();
                Log.d(TAG, "onResponse: " + result);

                Fragment fragment = new remedies();
                Bundle args = new Bundle();
                args.putString("Key", result);
                fragment.setArguments(args);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment1, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

}
