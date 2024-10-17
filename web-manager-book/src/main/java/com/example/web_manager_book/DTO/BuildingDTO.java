package com.example.web_manager_book.DTO;

import com.example.web_manager_book.Entity.Sach;

import java.util.List;

public class BuildingDTO {
    private String tenKhachHang;
    private String soDienThoai;
    private String diaChiKhachHang;
    private String email;
    private List<Sach> sachList;

    public List<Sach> getSachList() {
        return sachList;
    }

    public void setSachList(List<Sach> sachList) {
        this.sachList = sachList;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChiKhachHang() {
        return diaChiKhachHang;
    }

    public void setDiaChiKhachHang(String diaChiKhachHang) {
        this.diaChiKhachHang = diaChiKhachHang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
