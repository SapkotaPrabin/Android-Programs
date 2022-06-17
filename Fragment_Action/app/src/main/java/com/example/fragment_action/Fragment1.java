package com.example.fragment_action;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;

public class Fragment1 extends Fragment {
@Nullable
@Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment1,container,false);
        return view;
    }
}
