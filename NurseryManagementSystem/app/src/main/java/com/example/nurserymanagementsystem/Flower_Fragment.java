package com.example.nurserymanagementsystem;

import android.app.AlertDialog;
import android.content.Intent;
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
public class Flower_Fragment extends Fragment {
    Button add,flower_add;
    EditText name,price,num,sow_date;
    DBHelper DB;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.flower_fragment,container,false);
        add = view.findViewById(R.id.add_flower);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view2) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Add Flower");
                builder.setCancelable(true);
                LayoutInflater inflater = getLayoutInflater();
                View view3 = inflater.inflate(R.layout.add_flower,null);
                builder.setView(view3);
                flower_add = (Button)view3.findViewById(R.id.flower_add_db);
                name = view3.findViewById(R.id.flower_name);
                price = view3.findViewById(R.id.flower_price);
                num = view3.findViewById(R.id.flower_num);
                sow_date = view3.findViewById(R.id.flower_sow_date);
                flower_add.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String flower_na = name.getText().toString();
                        String flower_p = price.getText().toString();
                        String flower_s = sow_date.getText().toString();
                        String flower_nu = num.getText().toString();

                        Toast.makeText(getActivity(),flower_na+" "+flower_p+" "+flower_nu+" "+flower_s,Toast.LENGTH_SHORT).show();

//                        Boolean checkinsertdata = DB.insertflowerData(flower_na,flower_nu,flower_p,flower_s);
//                        if(checkinsertdata==true)
//                            Toast.makeText(getActivity(),"New Product Added",Toast.LENGTH_SHORT).show();
//                        else
//                            Toast.makeText(getActivity(),"Error adding product",Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        return view;
    }

}
