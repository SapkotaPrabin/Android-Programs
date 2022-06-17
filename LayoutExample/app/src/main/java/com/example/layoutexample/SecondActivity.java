package com.example.layoutexample;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity{
    Button pre1,next2;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        pre1 = (Button)findViewById(R.id.previous1);
        next2 = (Button)findViewById(R.id.next2);
        pre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(SecondActivity.this,FirstActivity.class);
                startActivity(intent2);
            }
        });
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent3);
            }
        });
    }
}
