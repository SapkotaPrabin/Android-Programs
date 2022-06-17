package com.example.layoutexample;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class emailform extends Activity{
    EditText editText1,editText2,editText3;
    Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        editText1 = (EditText)findViewById(R.id.to);
        editText2 = (EditText)findViewById(R.id.subject);
        editText3 = (EditText)findViewById(R.id.message);
        btn=(Button)findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to = editText1.getText().toString();
                String subject = editText2.getText().toString();
                String message = editText3.getText().toString();
                Intent intent = new Intent(emailform.this,EmailOutput.class);
                intent.putExtra("to",to);
                intent.putExtra("subject",subject);
                intent.putExtra("message",message);
                startActivity(intent);
            }
        });
    }
}
