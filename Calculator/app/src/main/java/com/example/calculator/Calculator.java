package com.example.calculator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class Calculator extends Activity {
    Button zero,one,two,three,four,five,six,seven,eight,nine,decimal,add,sub,mul,div,mod,clear,total;
    TextView textView1,textView2,operator;
    String value,op="";
    ImageView back;
    double n1=0.0d,n2=0.0d,n3=0.0d;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        zero=(Button)findViewById(R.id.zero);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        decimal = (Button)findViewById(R.id.decimal);
        textView1=(TextView)findViewById(R.id.textview1);
        textView2=(TextView)findViewById(R.id.textview2);
        operator=(TextView)findViewById(R.id.operator);
        clear=(Button) findViewById(R.id.clear);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.subtract);
        mul=(Button) findViewById(R.id.multiplication);
        div=(Button) findViewById(R.id.division);
        mod=(Button) findViewById(R.id.modulus);
        back=(ImageView) findViewById(R.id.back);
        total=(Button) findViewById(R.id.equal);
        textView2.setText("0");
        textView1.setText("0");
        zero.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                value = textView1.getText().toString();
                textView1.setText(value+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                    value = textView1.getText().toString();
                    textView1.setText(value + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                value = textView1.getText().toString();
                textView1.setText(value+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                value = textView1.getText().toString();
                textView1.setText(value+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                value = textView1.getText().toString();
                textView1.setText(value+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                value = textView1.getText().toString();
                textView1.setText(value+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                value = textView1.getText().toString();
                textView1.setText(value+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                value = textView1.getText().toString();
                textView1.setText(value+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                value = textView1.getText().toString();
                textView1.setText(value+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0"))
                    textView1.setText("");
                value = textView1.getText().toString();
                textView1.setText(value+"9");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                value = textView1.getText().toString();
                textView1.setText(value+".");
                n2=Double.parseDouble(textView1.getText().toString());
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textView1.setText("0");
                textView2.setText("0");
                operator.setText("");
                n1=n2=n3=0.0d;
            }
        });
        back.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view){
                if(textView1.getText().toString().length()!=1){
                    value = textView1.getText().toString();
                    textView1.setText(value.substring(0, value.length() - 1));
                }else{
                    textView1.setText("0");
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view){
                op="+";
                n1=Double.parseDouble(textView2.getText().toString());
                n2=Double.parseDouble(textView1.getText().toString());
                Calculation(op,n1,n2);
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                op="-";
                n1=Double.parseDouble(textView2.getText().toString());
                n2=Double.parseDouble(textView1.getText().toString());
                Calculation(op,n1,n2);
            }
        });
        mul.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                op="x";
                n1=Double.parseDouble(textView2.getText().toString());
                n2=Double.parseDouble(textView1.getText().toString());
                Calculation(op,n1,n2);
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                op="/";
                n1=Double.parseDouble(textView2.getText().toString());
                n2=Double.parseDouble(textView1.getText().toString());
                Calculation(op,n1,n2);
            }
        });
        mod.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                op="%";
                n1=Double.parseDouble(textView2.getText().toString());
                n2=Double.parseDouble(textView1.getText().toString());
                Calculation(op,n1,n2);
            }
        });
        total.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                op="=";
                n1=Double.parseDouble(textView2.getText().toString());
                n2=Double.parseDouble(textView1.getText().toString());
                Calculation(op,n1,n2);
            }
        });
        }
    public void Calculation(String op,Double n1,Double n2){
        String sign = operator.getText().toString();
        if(n1.equals(0.0d)){
            n3=n2;
        }
        if(sign.equals("+")){
            n3 = n1 + n2;
        }
        else if(sign.equals("-")) {
            n3 = n1 - n2;
        }
        else if(sign.equals("x")) {
            n3 = n1 * n2;
        }
        else if(sign.equals("/")) {
            n3 = n1 / n2;
        }
        else if(sign.equals("%")) {
            n3 = n1 % n2;
        }
        operator.setText(""+op);
        textView2.setText(n3+"");
        textView1.setText("");
        if(op.equals("=")){
            textView2.setText(n1+sign+n2);
            textView1.setText(n3+"");
        }

    }
}
