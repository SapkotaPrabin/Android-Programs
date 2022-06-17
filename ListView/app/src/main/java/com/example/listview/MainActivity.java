package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.listview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ActivityMainBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    int[] imageid = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
    String[] name = {"sdfsdf","sdfsdfsdf","sdfsdfsdfsdf","wedff"};
    String[] lastMessage = {"sdfsdf","sdfsdfsdf","sdfsdfsdfsdf","wedff"};
    String[] phone = {"sdfsdf","sdfsdfsdf","sdfsdfsdfsdf","wedff"};
    String[] country = {"sdfsdf","sdfsdfsdf","sdfsdfsdfsdf","wedff"};
        ArrayList<User> userArrayList = new ArrayList<>();
        for(int i=0;i<imageid.length;i++){
            User user = new User(name[i],lastMessage[i],phone[i],country[i],imageid[i]);
            userArrayList.add(user);
        }
        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
