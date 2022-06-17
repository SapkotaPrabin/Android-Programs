package com.example.tapmenu;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Dashboard extends AppCompatActivity {
    ViewPager2 viewPager2;
    TabLayout tabLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        getSupportActionBar().hide();
        viewPager2 = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        viewPager2.setAdapter(new FragmentAdapter(this));

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2,
                new TabLayoutMediator.TabConfigurationStrategy() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:{
                        tab.setText("Flower");
                        tab.setIcon(getResources().getDrawable(R.drawable.ic_sunflower_plant));
                        break;
                    }
                    case 1:{
                        tab.setText("Fruit");
                        tab.setIcon(getResources().getDrawable(R.drawable.ic_coconut_tree_color));
                        break;
                    }
                    case 2:{
                        tab.setText("Forest");
                        tab.setIcon(getResources().getDrawable(R.drawable.ic_pine_trees));
                        break;
                    }

                }
            }
        });tabLayoutMediator.attach();


    }
}
