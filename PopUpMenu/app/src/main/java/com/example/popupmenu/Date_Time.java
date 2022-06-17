package com.example.popupmenu;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Date_Time extends AppCompatActivity {
    EditText dateformat;
    int day,month,year;
    TextView timeshow;
    int hour,minute;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_time);
        dateformat = findViewById(R.id.date_format);
        Calendar calendar = Calendar.getInstance();
        dateformat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(Date_Time.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        dateformat.setText(SimpleDateFormat.getDateInstance().format(calendar.getTime()));
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        timeshow = findViewById(R.id.time);

        timeshow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        Date_Time.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                                hour = i;
                                minute = i1;
                                //Calendar calendar1 = Calendar.getInstance();
                                //calendar1.set(0,0,0,hour,minute);
                                //time.setText(DateFormat.getDateInstance().format(calendar.getTime()));
                                //time.setText(DateFormat.format("hh:mm aa",calendar1));
                                String time = hour+":"+minute;
                                SimpleDateFormat f24hours = new SimpleDateFormat( "HH:mm");
                                try{
                                        Date date = f24hours.parse(time);
                                        SimpleDateFormat f12hours = new SimpleDateFormat("hh:mm aa");
                                        timeshow.setText(f12hours.format(date));
                                }catch (ParseException e){
                                            e.printStackTrace();
                                }
                            }
                        },12,0,false
                );
                timePickerDialog.updateTime(hour,minute);
                timePickerDialog.show();
            }


        });
    }
}
