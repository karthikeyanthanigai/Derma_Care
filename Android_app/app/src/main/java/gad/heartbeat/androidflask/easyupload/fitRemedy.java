package gad.heartbeat.androidflask.easyupload;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fitRemedy extends Fragment implements View.OnClickListener {
    private static final String TAG = "fitRemedy";
    CardView rem1;
    CardView rem2;
    CardView rem3;
    CardView rem4;
    CardView rem5;
    CardView rem6;

    ImageView r1;
    ImageView r2;
    ImageView r3;
    ImageView r4;
    ImageView r5;
    ImageView r6;




    public fitRemedy() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fit_remedy, container, false);

        r1 = (ImageView) v.findViewById(R.id.r1);
        r2 = (ImageView) v.findViewById(R.id.r2);
        r3 = (ImageView) v.findViewById(R.id.r3);
        r4 = (ImageView) v.findViewById(R.id.r4);
        r5 = (ImageView) v.findViewById(R.id.r5);
        r6 = (ImageView) v.findViewById(R.id.r6);

        String value = getArguments().getString("Key");
        Log.d(TAG, "onCreateView: " + value);

        rem1 = v.findViewById(R.id.rem1);
        rem2 = v.findViewById(R.id.rem2);
        rem3 = v.findViewById(R.id.rem3);
        rem4 = v.findViewById(R.id.rem4);
        rem5 = v.findViewById(R.id.rem5);
        rem6 = v.findViewById(R.id.rem6);

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        r5.setOnClickListener(this);
        r6.setOnClickListener(this);

        if(value.equalsIgnoreCase("fit1")){
            r1.setImageResource(R.drawable.genacne1);
            r2.setImageResource(R.drawable.genacne2);
            r3.setImageResource(R.drawable.genacne3);
            r4.setImageResource(R.drawable.genacne4);
            r5.setImageResource(R.drawable.genacne5);
            r6.setImageResource(R.drawable.genacne6);
        }
        else if(value.equalsIgnoreCase("fit2")){
            r1.setImageResource(R.drawable.genoil1);
            r2.setImageResource(R.drawable.genoil2);
            r3.setImageResource(R.drawable.genoil3);
            r4.setImageResource(R.drawable.genoil4);
            r5.setImageResource(R.drawable.genoil5);
            r6.setImageResource(R.drawable.genoil6);

        }
        else if(value.equalsIgnoreCase("fit3")){
            r1.setImageResource(R.drawable.gendry1);
            r2.setImageResource(R.drawable.gendry2);
            r3.setImageResource(R.drawable.gendry3);
            r4.setImageResource(R.drawable.gendry4);
            r5.setImageResource(R.drawable.gendry5);
            r6.setImageResource(R.drawable.gendry6);

        }
        else if(value.equalsIgnoreCase("fit4")){
            r1.setImageResource(R.drawable.genhair1);
            r2.setImageResource(R.drawable.genhair2);
            r3.setImageResource(R.drawable.genhair3);
            r4.setImageResource(R.drawable.genhair4);
            r5.setImageResource(R.drawable.genhair5);
            r6.setImageResource(R.drawable.genhair6);

        }
        else if(value.equalsIgnoreCase("fit5")){
            r1.setImageResource(R.drawable.gendan1);
            r2.setImageResource(R.drawable.gendan2);
            r3.setImageResource(R.drawable.gendan3);
            r4.setImageResource(R.drawable.gendan4);
            r5.setImageResource(R.drawable.gendan5);
            r6.setImageResource(R.drawable.gendan6);

        }



        return  v;
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = new Tips();
        Bundle args = new Bundle();
        args.putString("Key", getResources().getResourceEntryName(view.getId()));
        fragment.setArguments(args);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment1, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
