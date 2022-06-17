package com.example.nurserymanagementsystem;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.app.Fragment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class Fruit_Fragment extends Fragment {
    Button add, fruit_add;
    EditText name, price, num, sow_date;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fruit_fragment, container, false);
        add = view.findViewById(R.id.add_fruit);
        Calendar calendar = Calendar.getInstance();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Add Fruit");
                builder.setCancelable(true);
                LayoutInflater inflater = getLayoutInflater();
                View view3 = inflater.inflate(R.layout.add_fruit, null);
                builder.setView(view3);
                fruit_add = (Button) view3.findViewById(R.id.fruit_add_db);
                name = view3.findViewById(R.id.fruit_name);
                price = view3.findViewById(R.id.fruit_price);
                num = view3.findViewById(R.id.fruit_num);
                sow_date = view3.findViewById(R.id.fruit_sow_date);
                fruit_add.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String fruit_na = name.getText().toString();
                        String fruit_p = price.getText().toString();
                        String fruit_s = sow_date.getText().toString();
                        String fruit_nu = num.getText().toString();
                        Toast.makeText(getActivity(), fruit_na + " " + fruit_p + " " + fruit_nu + " " + fruit_s, Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        return view;
    }

}
