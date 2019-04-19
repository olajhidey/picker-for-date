package com.jonetech.pickerfordate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePicker(View view) {
        DatePickerFragment mDialogFragment = new DatePickerFragment();
       mDialogFragment.show(getSupportFragmentManager(), "datepicker");
    }

    public void processDateResult(int year, int month, int day){
        String month_string = Integer.toString(month+1);
        String year_string =  Integer.toString(year);
        String day_string = Integer.toString(day);
        String message = day_string+ "/" + month_string+ "/" + year_string;

        Toast.makeText(this,"Date: " +message, Toast.LENGTH_SHORT).show();
    }
}
