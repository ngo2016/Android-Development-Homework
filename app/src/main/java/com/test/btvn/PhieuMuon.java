package com.test.btvn;

import androidx.annotation.NonNull;

public class PhieuMuon {
    String id, ngay, ghiChu, loaiSach, docGia;

    public PhieuMuon(String id, String ngay, String ghiChu, String loaiSach, String docGia) {
        this.id = id;
        this.ngay = ngay;
        this.ghiChu = ghiChu;
        this.loaiSach = loaiSach;
        this.docGia = docGia;
    }

    public PhieuMuon() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

    public String getDocGia() {
        return docGia;
    }

    public void setDocGia(String docGia) {
        this.docGia = docGia;
    }

    @NonNull
    @Override
    public String toString() {
        //TODO: SUA LAI CHO GIONG VIDEO
        return super.toString();
    }
}
