package com.example.popupmenu;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
public class Show_Custom extends Activity {
    EditText edtFirst,edtSecond;
    Button show_custom,btnCalculate;
    TextView showresult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity);
        show_custom = findViewById(R.id.show_custom);
        show_custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }
    public void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Show_Custom.this);
        builder.setTitle("Calculate Sum");
        builder.setCancelable(true);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_dialog,null);
        builder.setView(view);
        edtFirst = view.findViewById(R.id.edtFirst);
        edtSecond = view.findViewById(R.id.edtSecond);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        showresult = view.findViewById(R.id.txtResult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second,result;
                first = Integer.parseInt(edtFirst.getText().toString());
                second = Integer.parseInt(edtSecond.getText().toString());
                result = first + second;
                showresult.setText("Result : "+result);
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
