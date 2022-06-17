package com.example.signup;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class form extends Activity {
    EditText name,address,contact,email;
    RadioGroup gender;
    RadioButton radioButton;
    Spinner faculty;
    Button btn;
    CheckBox java,php,cs,html,js;
    ArrayList<String> program = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fillupform);
        name = (EditText)findViewById(R.id.name);
        address = (EditText)findViewById(R.id.address);
        contact = (EditText)findViewById(R.id.contact);
        email = (EditText)findViewById(R.id.email);
        faculty = (Spinner) findViewById(R.id.faculty);
        gender = (RadioGroup)findViewById(R.id.gender);
        java = findViewById(R.id.java);
        php = findViewById(R.id.php);
        cs = findViewById(R.id.cs);
        html = findViewById(R.id.html);
        js = findViewById(R.id.js);
        btn = (Button) findViewById(R.id.submit);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(java.isChecked())
                    program.add("Java");
                else
                    program.remove("Java");
            }
        });
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cs.isChecked())
                    program.add("C#");
                else
                    program.remove("C#");
            }
        });
        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(html.isChecked())
                    program.add("HTML & CSS");
                else
                    program.remove("HTML & CSS");
            }
        });
        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(js.isChecked())
                    program.add("JavaScript");
                else
                    program.remove("JavaScript");
            }
        });
        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(php.isChecked())
                    program.add("PHP");
                else
                    program.remove("PHP");
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String a = address.getText().toString();
                String c = contact.getText().toString();
                String e = email.getText().toString();
                int radioId=gender.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                String g = radioButton.getText().toString();
                String f = faculty.getSelectedItem().toString();
                StringBuilder sb = new StringBuilder();
                for(String s : program){
                    sb.append(s).append(" ");
                }
                Intent intent = new Intent(form.this,ShowData.class);
                intent.putExtra("name",n);
                intent.putExtra("address",a);
                intent.putExtra("contact",c);
                intent.putExtra("email",e);
                intent.putExtra("gender",g);
                intent.putExtra("faculty",f);
                intent.putExtra("program", sb.toString());
                startActivity(intent);
            }
        });
    }
}
