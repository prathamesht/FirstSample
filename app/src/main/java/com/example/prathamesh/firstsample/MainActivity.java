package com.example.prathamesh.firstsample;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private DatePicker datePicker;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //datePicker = (DatePicker) findViewById(R.id.date_picker);
        textView = (TextView) findViewById(R.id.text_view);
        button = (Button) findViewById(R.id.button);

       // datePicker.onDa

    }

    private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
           /* year = selectedYear;
            month = selectedMonth;
            dayOfMonth = selectedDay;

            // set selected date into textview
            textView.setText(new StringBuilder().append(month + 1)
                    .append("-").append(dayOfMonth).append("-").append(year)
                    .append(" "));

            // set selected date into datepicker also
            dpResult.init(year, month, day, null);*/
        }
    };
}
