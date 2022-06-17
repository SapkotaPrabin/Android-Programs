package com.example.layoutexample;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends Activity {
    Button pre2;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);
        pre2 = (Button)findViewById(R.id.previous2);
        pre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(intent4);
            }
        });
    }
}
