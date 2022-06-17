package com.example.nurserymanagementsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Sign_Up extends Activity {
    EditText name,username,email,contact,password,re_password;
    Button log_in,sign_up;
    DBHelper DB;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        name = (EditText) findViewById(R.id.signup_name);
        username =(EditText) findViewById(R.id.signup_username);
        email =(EditText) findViewById(R.id.signup_email);
        contact = (EditText)findViewById(R.id.signup_phone);
        password = (EditText)findViewById(R.id.signup_password);
        re_password = (EditText)findViewById(R.id.signup_re_password);
        log_in = (Button) findViewById(R.id.login_button);
        sign_up = (Button) findViewById(R.id.signup_submit);
        DB = new DBHelper(this);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_Up.this,Log_in.class);
                startActivity(intent);
            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String signup_name = name.getText().toString();
                String signup_username = username.getText().toString();
                String signup_email = email.getText().toString();
                String signup_contact = contact.getText().toString();
                String signup_password = password.getText().toString();
                String signup_re_password = re_password.getText().toString();
                if(signup_name.equals("")||signup_username.equals("")||signup_email.equals("")||signup_username.equals("")||signup_password.equals("")||signup_re_password.equals("")||signup_contact.equals("")){
                    Toast.makeText(Sign_Up.this,"Please enter all the fields",Toast.LENGTH_SHORT).show();
                }else{
                    if(signup_password.equals(signup_re_password)){
                        Boolean checkuser = DB.checkusername(signup_username);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(signup_name,signup_email,signup_contact,signup_username,signup_password);
                            if(insert==true){
                                Toast.makeText(Sign_Up.this,"Registered successfully",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Sign_Up.this,Log_in.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(Sign_Up.this,"Registration failed",Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(Sign_Up.this,"User already exists ! Please sign in",Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(Sign_Up.this,"Passwords not matching !!!",Toast.LENGTH_SHORT).show();
                    }
                }
//                Toast.makeText(getApplicationContext(),"Account Created Successfully !!!",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(Sign_Up.this,Log_in.class);
//                startActivity(intent);
            }
        });

    }
}
