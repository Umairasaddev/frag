package com.example.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class f2 extends Fragment {

    TextView textView;

    public f2(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_f2, container, false);

        textView = textView.findViewById(R.id.tv);
        Bundle bundle = this.getArguments();
        String data =bundle.getString("key");
        textView.setText(data);
        return view;



    }
}