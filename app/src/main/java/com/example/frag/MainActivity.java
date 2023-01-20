package com.example.frag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //will add first fragment by default
        // where you want to add fragment (mail container) and which fragment you want to add
        getSupportFragmentManager().beginTransaction().add(R.id.mail_container,new f1()).commit();
    }
}