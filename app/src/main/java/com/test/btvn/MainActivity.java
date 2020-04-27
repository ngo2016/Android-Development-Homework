package com.test.btvn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //CheckBox android, unity, unreal;

//    EditText nameText;
//    RadioButton rbSv, rbGv;
//    Button btnSub;
//    TextView resultText;

    //    ImageView img;
    Button btnBt1, btnBt2, btnBt6, btnTest, btnBt5, btnBt4;

    void SetControl() {
//        android = findViewById(R.id.android);
//        unity = findViewById(R.id.unity);
//        unreal = findViewById(R.id.unreal);

//        nameText = findViewById(R.id.nameText);
//        rbSv = findViewById(R.id.rbSv);
//        rbGv = findViewById(R.id.rbGv);
//        btnSub = findViewById(R.id.btnSub);
//        resultText = findViewById(R.id.resultText);

//        img=findViewById(R.id.img);
//        btn1=findViewById(R.id.btn1);
//        btn2=findViewById(R.id.btn2);

        btnBt1 = findViewById(R.id.btnBt1);
        btnBt2 = findViewById(R.id.btnBt2);
        btnBt6 = findViewById(R.id.btnBt6);
        btnTest = findViewById(R.id.btnTest);
        btnBt5 = findViewById(R.id.btnBt5);
        btnBt4 = findViewById(R.id.btnBt4);

    }

    void SetEvent() {
//        android.setOnClickListener(this);
//        unity.setOnClickListener(this);
//        unreal.setOnClickListener(this);

//        btnSub.setOnClickListener(this);

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                img.setImageResource(R.drawable.wallhaven_ox8dql);
//            }
//        });
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                img.setImageResource(R.drawable.wallhaven_q6qdp5);
//            }
//        });

        btnBt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt1 = new Intent(MainActivity.this, BtChuong1.class);
                startActivity(bt1);
            }
        });

        btnBt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt2 = new Intent(MainActivity.this, BtChuong2DangNhap.class);
                startActivity(bt2);
            }
        });

        btnBt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt6 = new Intent(MainActivity.this, Bt6Chuong2.class);
                startActivity(bt6);
            }
        });

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent(MainActivity.this, BuoiHoc042520.class);
                startActivity(test);
            }
        });

        btnBt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt5 = new Intent(getApplicationContext(), Bt5Chuong2.class);
                startActivity(bt5);
            }
        });

        btnBt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt4 = new Intent(getApplicationContext(), Bt4Chuong2.class);
                startActivity(bt4);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.menu);

        SetControl();
        SetEvent();
    }

//    @Override
//    public void onClick(View v) {
////        switch (v.getId()){
////            case R.id.android :{
////                if (android.isChecked()){
////                    Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();
////                    break;
////                }
////            }
////            case R.id.unity :{
////                if (android.isChecked()){
////                    Toast.makeText(getApplicationContext(), "Unity", Toast.LENGTH_LONG).show();
////                    break;
////                }
////            }
////            case R.id.unreal :{
////                if (android.isChecked()){
////                    Toast.makeText(getApplicationContext(), "Unreal", Toast.LENGTH_LONG).show();
////                    break;
////                }
////            }
////        }
//
////        String result = "";
////        result += nameText.getText().toString().trim();
////
////        if (result == "") {
////            Toast.makeText(getApplicationContext(), "Tên không được để trống!", Toast.LENGTH_LONG).show();
////            return;
////        }
////
////        if (!rbSv.isChecked() && !rbGv.isChecked()) {
////            Toast.makeText(getApplicationContext(), "Vui lòng chọn nghề nghiệp!", Toast.LENGTH_LONG).show();
////            return;
////        } else {
////            if (rbSv.isChecked()) {
////                result += ". Nghề nghiệp: Sinh viên";
////            }
////            if (rbGv.isChecked()) {
////                result += ". Nghề nghiệp: Giảng Viên";
////            }
////        }
////
////        resultText.setText("Tên: " + result);
//    }
}
