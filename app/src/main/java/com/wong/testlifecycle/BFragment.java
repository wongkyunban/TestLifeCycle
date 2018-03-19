package com.wong.testlifecycle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class BFragment extends Fragment {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("onAttach","onAttach fragment");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("onCreate","onCreate fragment");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("onCreateView","onCreateView fragment");

        return inflater.inflate(R.layout.fragment_b, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("onActivityCreated","onActivityCreated fragment");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart","onStart fragment");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("onResume","onResume fragment");

    }


    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPause","onPause fragment");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("onStop","onStop fragment");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("onDestroyView","onDestroyView fragment");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy","onDestroy fragment");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("onDetach","onDetach fragment");

    }
}
