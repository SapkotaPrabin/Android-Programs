package com.example.nms;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import android.app.Fragment;

public class MainActivity extends Activity {
    Button get_Button,login_b,signup_b;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_frame);

        get_Button = findViewById(R.id.get_start);
        login_b = findViewById(R.id.login_button);
        signup_b = findViewById(R.id.signup_button);

        get_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new get_start();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment2, fragment);
                transaction.commit();
            }
        });

    }
}
