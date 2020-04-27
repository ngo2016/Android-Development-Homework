package com.test.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BtChuong1 extends AppCompatActivity {

    Button btnAdd, btnMinus, btnMul, btnDiv;
    TextView tvResult;
    EditText txtA, txtB;
    float numA, numB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt_chuong_1);

        setControl();
        setEvent();
    }

    private void setControl() {
        btnAdd = findViewById(R.id.btCong);
        btnMinus = findViewById(R.id.btTru);
        btnMul = findViewById(R.id.btNhan);
        btnDiv = findViewById(R.id.btChia);
        txtA = findViewById(R.id.txSoA);
        txtB = findViewById(R.id.txSoB);
        tvResult = findViewById(R.id.tvKetQua);
    }

    private void setEvent(){
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txtA.getText().toString().matches("") && !txtB.getText().toString().matches("")){
                    numA = Float.valueOf(txtA.getText().toString());
                    numB = Float.valueOf(txtB.getText().toString());
                    float tong;
                    tong = numA + numB;
                    tvResult.setText("Kết quả = " + tong);
                }else {
                    Toast.makeText(BtChuong1.this,"Vui lòng nhập số" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txtA.getText().toString().matches("") && !txtB.getText().toString().matches("")){
                    numA = Float.valueOf(txtA.getText().toString());
                    numB = Float.valueOf(txtB.getText().toString());
                    float hieu = numA - numB;
                    tvResult.setText("Kết quả = " + hieu);
                }else {
                    Toast.makeText(BtChuong1.this,"Vui lòng nhập số" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txtA.getText().toString().matches("") && !txtB.getText().toString().matches("")){
                    numA = Float.valueOf(txtA.getText().toString());
                    numB = Float.valueOf(txtB.getText().toString());
                    float tich = numA * numB;
                    tvResult.setText("Kết quả = " + tich);
                }else {
                    Toast.makeText(BtChuong1.this,"Vui lòng nhập số" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txtA.getText().toString().matches("") && !txtB.getText().toString().matches("")){
                    numA = Float.valueOf(txtA.getText().toString());
                    numB = Float.valueOf(txtB.getText().toString());
                    if(numB == 0){
                        Toast.makeText(BtChuong1.this, "Số B phải khác 0", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        float thuong = numA / numB;
                        tvResult.setText("Kết quả = " + thuong);
                    }
                }else {
                    Toast.makeText(BtChuong1.this,"Vui lòng nhập số" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_custom, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.itback:
//                Intent intent = new Intent(bt_chuong_1.this, MainActivity.class);
//                startActivity(intent);
//                Toast.makeText(this, "Back to Main", Toast.LENGTH_SHORT).show();
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
