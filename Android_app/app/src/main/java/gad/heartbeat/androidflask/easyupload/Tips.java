package gad.heartbeat.androidflask.easyupload;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tips extends Fragment {
    private static final String TAG = "Tips";

    public Tips() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tips, container, false);
        
        String value = getArguments().getString("Key");
        Log.d(TAG, "onCreateView: "+ value);
        return v;
    }
}
