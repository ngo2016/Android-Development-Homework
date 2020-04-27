package com.test.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class Bt5Chuong2 extends AppCompatActivity {
    RadioButton rb1, rb2, rb3;
    ImageView img;

    void SetControl() {
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        img = findViewById(R.id.img);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt5_chuong2);
        SetControl();
        SetEvent();
    }

    private void SetEvent() {
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.isChecked()) {
                    img.setImageResource(R.drawable.wallhaven_q6qdp5);
                }
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb2.isChecked()) {
                    img.setImageResource(R.drawable.wallhaven_ox8dql);
                }
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb3.isChecked()) {
                    img.setImageResource(R.drawable.wallhaven_j57w6w);
                }
            }
        });
    }
}
