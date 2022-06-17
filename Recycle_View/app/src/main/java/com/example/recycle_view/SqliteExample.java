package com.example.recycle_view;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SqliteExample extends AppCompatActivity {
    EditText edtName,edtDate,edtNo,edtPrice;
    Button btnInsert,btnSelect,btnUpdate,btnDelete;
    MyDbHelper myDbHelper;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerviewAdapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.sqlite_example);
        myDbHelper = new MyDbHelper(this);
        edtName = findViewById(R.id.flower_name);
        edtDate = findViewById(R.id.flower_sow);
        edtNo = findViewById(R.id.flower_num);
        edtPrice = findViewById(R.id.flower_price);
        btnInsert = findViewById(R.id.btnInsert);
        btnSelect = findViewById(R.id.btnSelect);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= edtName.getText().toString();
                String date= edtDate.getText().toString();
                int num = Integer.parseInt(edtNo.getText().toString());
                int price = Integer.parseInt(edtPrice.getText().toString());
                myDbHelper.insertData(name,date,num,price);
                Toast.makeText(getApplicationContext(),"Insert Successfully",Toast.LENGTH_SHORT).show();
            }
        });
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<DataModel> data = new ArrayList<>();
                Cursor cursor = myDbHelper.selectData();
                while (cursor.moveToNext()){
                   String name= cursor.getString(1);
                    String  date=cursor.getString(2);
                  int  num=cursor.getInt(3);
                    int  price=cursor.getInt(4);
                    DataModel dataModel = new DataModel(name,num,price,date);
                    data.add(dataModel);
                }
               layoutManager = new LinearLayoutManager(SqliteExample.this);
                recyclerView.setLayoutManager(layoutManager);
                recyclerviewAdapter = new RecyclerViewAdapter(SqliteExample.this,data);
                recyclerView.setAdapter(recyclerviewAdapter);
            }
        });
    }
}
