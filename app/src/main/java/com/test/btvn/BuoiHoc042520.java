package com.test.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class BuoiHoc042520 extends AppCompatActivity {
//    Button btn;
//    Switch swWifi, sw5G;

    //    Spinner spinner;
//    String string[] = {"Nokia", "Motorola", "Google", "Samsung", "Xiaomi"};
//
//    ListView list;

    TimePicker time;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buoi_hoc042520);

        time=findViewById(R.id.time);
        txt=findViewById(R.id.txt);

        time.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                txt.setText("Time now is: " + hourOfDay + ":" + minute);
            }
        });

//        list = findViewById(R.id.list);
//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, string);
//
//        list.setAdapter(adapter);
//
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getApplicationContext(), "You choose: " + string[position], Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        spinner=findViewById(R.id.spinner);
//        spinner.setAdapter(adapter);
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getApplicationContext(), "You choose: " + string[position], Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

//        btn = findViewById(R.id.btn);
//        swWifi = findViewById(R.id.swWifi);
//        sw5G = findViewById(R.id.sw5G);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String notifi = "";
//
//                if (swWifi.isChecked()) {
//                    notifi += "Wifi: " + swWifi.getTextOn().toString() + " ";
//                } else {
//                    notifi += "Wifi: " + swWifi.getTextOff().toString() + " ";
//                }
//
//                if (sw5G.isChecked()) {
//                    notifi += "5G: " + sw5G.getTextOn().toString();
//                } else {
//                    notifi += "5G: " + sw5G.getTextOff().toString();
//                }
//
//                Toast.makeText(getApplicationContext(), notifi, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
