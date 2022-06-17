package com.example.nurserymanagementsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Log_in extends Activity {
    Button sign_up,log_in;
    EditText username;
    EditText password;
    DBHelper DB;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        sign_up = findViewById(R.id.signup_button);
        log_in = findViewById(R.id.login_submit);
        username = (EditText)findViewById(R.id.login_username);
        password = (EditText)findViewById(R.id.login_password);
        DB = new DBHelper(this);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Log_in.this,Sign_Up.class);
                startActivity(intent);
            }
        });
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String login_username = username.getText().toString();
                String login_password = password.getText().toString();

                if(login_username.equals("")||login_password.equals("")){
                    Toast.makeText(Log_in.this,"Please enter all the fields",Toast.LENGTH_SHORT).show();
                }else{
                    Boolean checkuserpass = DB.checkusernamepassword(login_username,login_password);
                    if(checkuserpass==true){
                        Toast.makeText(Log_in.this,"Log in Successfull",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Log_in.this, Dashboard.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Log_in.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
