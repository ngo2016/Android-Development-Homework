package com.test.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class QuanLyThuVien extends AppCompatActivity {
    EditText etSoPhieu, etNgayMuon, etGhiChu;
    Spinner spDocGia, spLoaiSach;
    Button btnThem, btnXoa, btnSua, btnThoat;
    ListView lvSach;
    int index;

    ArrayList docGia = new ArrayList();
    ArrayList loaiSach = new ArrayList();

    ArrayList<PhieuMuon> phieuMuons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_thu_vien);
        SetControl();
        SetEvent();
    }

    private void SetEvent() {
        docGia.add("Zed");
        docGia.add("Shen");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, docGia);
        spDocGia.setAdapter(adapter);

        loaiSach.add("Lightnovel");
        loaiSach.add("Khoa hoc vien tuong");
        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, loaiSach);
        spLoaiSach.setAdapter(adapter1);

        final ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, phieuMuons);
        lvSach.setAdapter(adapter2);

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etSoPhieu.toString().equals("")) {
                    etSoPhieu.setError("Ban phai nhap ID");
                    etSoPhieu.requestFocus();
                    return;
                }
                if (etNgayMuon.toString().equals("")) {
                    etNgayMuon.setError("Ban phai nhap ngay muon");
                    etNgayMuon.requestFocus();
                    return;
                }
                PhieuMuon phieuMuon = new PhieuMuon(etSoPhieu.getText().toString(), etNgayMuon.getText().toString(),
                        etGhiChu.getText().toString(), spLoaiSach.getSelectedItem().toString(), spDocGia.getSelectedItem().toString());
                phieuMuons.add(phieuMuon);
                adapter2.notifyDataSetChanged();
            }
        });

        lvSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                index = position;
                etSoPhieu.setText(phieuMuons.get(position).getId());
                etNgayMuon.setText(phieuMuons.get(position).getId());
                etGhiChu.setText(phieuMuons.get(position).getId());
                spLoaiSach.setSelection(docGia.indexOf(phieuMuons.get(position).getId()));
                spDocGia.setSelection(loaiSach.indexOf(phieuMuons.get(position).getId()));
            }
        });

        lvSach.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                phieuMuons.remove(position);
                adapter2.notifyDataSetChanged();
                return false;
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index != -1 && phieuMuons.isEmpty()) {
                    return;
                }
                phieuMuons.remove(index);
                adapter2.notifyDataSetChanged();
            }
        });

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index != -1 && phieuMuons.isEmpty()) {
                    return;
                }
                PhieuMuon phieuMuon = phieuMuons.get(index);
                phieuMuon.setId(etSoPhieu.getText().toString().trim());
                phieuMuon.setNgay(etNgayMuon.getText().toString().trim());
                phieuMuon.setGhiChu(etGhiChu.getText().toString().trim());
                phieuMuon.setDocGia(spDocGia.getSelectedItem().toString().trim());
                phieuMuon.setLoaiSach(spLoaiSach.getSelectedItem().toString().trim());
                adapter2.notifyDataSetChanged();
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void SetControl() {
        etSoPhieu = findViewById(R.id.etSoPhieu);
        etNgayMuon = findViewById(R.id.etNgay);
        etGhiChu = findViewById(R.id.etGhiChu);
        spDocGia = findViewById(R.id.spinnerDocGia);
        spLoaiSach = findViewById(R.id.spinnerLoaiSach);
        btnThem = findViewById(R.id.btnThem);
        btnXoa = findViewById(R.id.btnXoa);
        btnSua = findViewById(R.id.btnSua);
        btnThoat = findViewById(R.id.btnThoat);
        lvSach = findViewById(R.id.lvSach);
    }
}
