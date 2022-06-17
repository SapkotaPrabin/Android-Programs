package com.example.layoutexample;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EmailOutput extends Activity {
    TextView tv1,tv2,tv3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output);
        tv1 = (TextView) findViewById(R.id.to);
        tv2 = (TextView) findViewById(R.id.subject);
        tv3 = (TextView) findViewById(R.id.message);
        Intent intent=getIntent();
        String to1 = intent.getStringExtra("to");
        String subject = intent.getStringExtra("subject");
        String message = intent.getStringExtra("message");
        tv1.setText(to1);
        tv2.setText(subject);
        tv3.setText(message);
    }
}
