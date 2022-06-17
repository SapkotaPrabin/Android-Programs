package com.example.fragment_example;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
public class Fragment_form extends Fragment {
    EditText first,second;
    Button calculate;
    TextView result;
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        first =view.findViewById(R.id.first);
        second = view.findViewById(R.id.second);
        calculate = view.findViewById(R.id.calculate);
        result = view.findViewById(R.id.result);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,lastresult;
                firstvalue = Integer.parseInt(first.getText().toString());
                secondvalue  = Integer.parseInt(second.getText().toString());
                lastresult = firstvalue+secondvalue;
                result.setText("Sum of "+firstvalue+" & "+secondvalue + " = "+lastresult);
            }
        });
        return view;
    }
}
