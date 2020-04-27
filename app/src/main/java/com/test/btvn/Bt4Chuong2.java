package com.test.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Bt4Chuong2 extends AppCompatActivity {
    CheckBox cbBack, cbText;
    RadioButton rbLeft, rbCen, rbRight;
    Button btnShow;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt4_chuong2);
        SetControl();
        SetEvent();
    }

    private void SetEvent() {
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbBack.isChecked()){
                    txtResult.setBackgroundColor(Color.GRAY);
                }
                if (cbText.isChecked()){
                    txtResult.setTextColor(Color.RED);
                }
                if (rbLeft.isChecked()){
                    txtResult.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);
                }
                if (rbCen.isChecked()){
                    txtResult.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                }
                if (rbRight.isChecked()){
                    txtResult.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);
                }
                txtResult.setText("Trần Văn Trường");
            }
        });
    }

    private void SetControl() {
        cbBack=findViewById(R.id.cbBack);
        cbText=findViewById(R.id.cbText);
        rbLeft=findViewById(R.id.rbLeft);
        rbCen=findViewById(R.id.rbCen);
        rbRight=findViewById(R.id.rbRight);
        btnShow=findViewById(R.id.btnShow);
        txtResult=findViewById(R.id.txtResult);
    }
}
