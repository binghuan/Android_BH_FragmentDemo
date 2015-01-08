package com.bh.android.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingFragment extends Fragment {

    public static final String TAG = "BH_SettingFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View settingLayout = inflater.inflate(R.layout.setting_layout,
                container, false);

        Log.v(TAG, "+++ onCreateView +++");

        return settingLayout;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(TAG, "+++ onCreate +++");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.v(TAG, "+++ onAttach +++");
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
