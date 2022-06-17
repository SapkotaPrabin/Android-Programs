package com.example.nurserymanagementsystem;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.ContentView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Fragment;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Forest_Fragment extends Fragment {
    Button add, forest_add;
    EditText name, price, num, sow_date;
    int day,month,year;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.forest_fragment,container,false);
        add = view.findViewById(R.id.add_forest);
        Calendar calendar = Calendar.getInstance();
       add.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view2) {
               AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
               builder.setTitle("Add Forest");
               builder.setCancelable(true);
               LayoutInflater inflater = getLayoutInflater();
               View view3 = inflater.inflate(R.layout.add_forest,null);
               builder.setView(view3);
               forest_add = (Button) view3.findViewById(R.id.forest_add_db);
               name = view3.findViewById(R.id.forest_name);
               price = view3.findViewById(R.id.forest_price);
               num = view3.findViewById(R.id.forest_num);
               sow_date = view3.findViewById(R.id.forest_sow_date);
               forest_add.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       String forest_na = name.getText().toString();
                       String forest_p = price.getText().toString();
                       String forest_s = sow_date.getText().toString();
                       String forest_nu = num.getText().toString();
                       Toast.makeText(getActivity(), forest_na + " " + forest_p + " " + forest_nu + " " + forest_s, Toast.LENGTH_SHORT).show();
                   }
               });
               AlertDialog alert = builder.create();
               alert.show();
           }
       });
        return view;
    }


}
