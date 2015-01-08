package com.bh.android.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by binghuan on 1/8/15.
 */
public class MessageFragment extends Fragment {

    public static final String TAG = "BH_MessageFragment";

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View messageLayout = inflater.inflate(R.layout.message_layout, container, false);

        Log.v(TAG, "+++ onCreateView +++");

        return messageLayout;
    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.v(TAG, "+++ onAttach +++");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(TAG, "+++ onCreate +++");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.v(TAG, "+++ onActivityCreated +++");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.v(TAG, "+++ onStart +++");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.v(TAG, "+++ onResume +++");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.v(TAG, "+++ onPause +++");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.v(TAG, "+++ onStop +++");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.v(TAG, "+++ onDestroyView +++");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.v(TAG, "+++ onDestroy +++");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.v(TAG, "+++ onDetach +++");
    }

}
