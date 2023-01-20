package com.example.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class f1 extends Fragment {

    EditText editText;
    Button button;

    public f1(){}




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_f1, container, false);

        button = view.findViewById(R.id.bf1);
        editText = view.findViewById(R.id.ET);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("key",editText.getText().toString());

                f2 fragment2 = new f2();
                fragment2.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.mail_container,fragment2).commit();

            }
        });

        return view;
    }
}