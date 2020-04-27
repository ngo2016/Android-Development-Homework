package com.test.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BtChuong2DangNhap extends AppCompatActivity {

    EditText txtUsername, txtPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt_chuong2_dang_nhap);

        SetControl();
        SetEvent();
    }

    private void SetControl() {
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    void SetEvent(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtUsername.getText().toString().equals("zed") && txtPassword.getText().toString().equals("123")){
                    Toast.makeText(BtChuong2DangNhap.this, "Welcome", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(BtChuong2DangNhap.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(BtChuong2DangNhap.this, "Wrong username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
