package com.example.signup;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class ShowData extends Activity {
    TextView name,address,contact,email,gender,faculty,program;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outputdisplay);
        name = (TextView) findViewById(R.id.name);
        address = (TextView) findViewById(R.id.address);
        contact = (TextView) findViewById(R.id.contact);
        email = (TextView) findViewById(R.id.email);
        gender = (TextView) findViewById(R.id.gender);
        faculty = (TextView) findViewById(R.id.faculty);
        program = (TextView) findViewById(R.id.program);
        Intent intent=getIntent();
        String name1 = intent.getStringExtra("name");
        String address1 = intent.getStringExtra("address");
        String contact1 = intent.getStringExtra("contact");
        String email1 = intent.getStringExtra("email");
        String gender1 = intent.getStringExtra("gender");
        String faculty1 = intent.getStringExtra("faculty");
        String program1 = intent.getStringExtra("program");
        name.setText(name1);
        address.setText(address1);
        contact.setText(contact1);
        email.setText(email1);
        gender.setText(gender1);
        faculty.setText(faculty1);
        program.setText(program1);
    }
}
