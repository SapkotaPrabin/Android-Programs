package com.example.settoolbarmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;

public class MainActivity extends AppCompatActivity {
    private androidx.appcompat.view.ActionMode mActionMode;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        textView = (TextView) findViewById(R.id.text);

        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(mActionMode !=null){
                    return false;
                }
                mActionMode = startSupportActionMode( mActionModeCallback);
                return true;

            }
        });
    }
   private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
       @Override
       public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
           actionMode.getMenuInflater().inflate(R.menu.example_menu, menu);
           actionMode.setTitle("Choose Your Option");
           return false;
       }

       @Override
       public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
           return false;
       }

       @Override
       public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
           switch (menuItem.getItemId()) {
               case R.id.option_1:
                   Toast.makeText(MainActivity.this, "Option 1", Toast.LENGTH_SHORT).show();
                   actionMode.finish();
                   return true;
               case R.id.option_2:
                   Toast.makeText(MainActivity.this, "Option 2", Toast.LENGTH_SHORT).show();
                   actionMode.finish();
                   return true;
               default:
                   return false;
           }

       }

       @Override
       public void onDestroyActionMode(ActionMode actionMode) {

       }
   };
}
