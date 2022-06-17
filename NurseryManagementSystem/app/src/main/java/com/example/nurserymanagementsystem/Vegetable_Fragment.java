package com.example.nurserymanagementsystem;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Calendar;

public class Vegetable_Fragment extends Fragment {
    Button add, veg_add;
    EditText name, price, num, sow_date;
    int day,month,year;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vegetable_fragment,container,false);
        add = view.findViewById(R.id.add_veg);
        Calendar calendar = Calendar.getInstance();
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view2) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Add Vegetable");
                builder.setCancelable(true);
                LayoutInflater inflater = getLayoutInflater();
                View view3 = inflater.inflate(R.layout.add_vegetable,null);
                builder.setView(view3);
                veg_add = (Button) view3.findViewById(R.id.veg_add_db);
                name = view3.findViewById(R.id.veg_name);
                price = view3.findViewById(R.id.veg_price);
                num = view3.findViewById(R.id.veg_num);
                sow_date = view3.findViewById(R.id.veg_sow_date);
                veg_add.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String veg_na = name.getText().toString();
                        String veg_p = price.getText().toString();
                        String veg_s = sow_date.getText().toString();
                        String veg_nu = num.getText().toString();
                        Toast.makeText(getActivity(), veg_na + " " + veg_p + " " + veg_nu + " " + veg_s, Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        return view;
    }

}
