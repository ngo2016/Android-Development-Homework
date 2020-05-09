package com.test.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class BuoiHoc050920 extends AppCompatActivity {
    DatePicker datePicker;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buoi_hoc052920);

        SetControl();
        SetEvent();
    }

    private void SetEvent() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Ngay " + datePicker.getDayOfMonth() + " Thang "
                        + datePicker.getMonth() + " Nam " + datePicker.getYear();
                Toast.makeText(getApplicationContext(), result,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void SetControl() {
        datePicker=findViewById(R.id.datePicker);
        button=findViewById(R.id.button);
    }
}
