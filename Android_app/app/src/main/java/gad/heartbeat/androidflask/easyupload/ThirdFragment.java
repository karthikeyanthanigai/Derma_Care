package gad.heartbeat.androidflask.easyupload;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ThirdFragment extends Fragment  implements View.OnClickListener{
    CardView fit1;
    CardView fit2;
    CardView fit3;
    CardView fit4;
    CardView fit5;


    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_third, container, false);
        fit1 = v.findViewById(R.id.fit1);
        fit2 = v.findViewById(R.id.fit2);
        fit3 = v.findViewById(R.id.fit3);
        fit4 = v.findViewById(R.id.fit4);
        fit5 = v.findViewById(R.id.fit5);

        fit1.setOnClickListener(this);
        fit2.setOnClickListener(this);
        fit3.setOnClickListener(this);
        fit4.setOnClickListener(this);
        fit5.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = new fitRemedy();
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
