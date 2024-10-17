package com.example.web_manager_book.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="ChiTietPhieuNhap")
public class ChiTietPhieuNhap {
    private Long soLuongNhap;
    private Long giaNhap;
    @ManyToOne
    @JoinColumn(name="maSach")
    @JsonIgnore
    private Sach sach;
    @Id
    @ManyToOne
    @JoinColumn(name="soPN")
    private PhieuNhap phieuNhap;

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public Long getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(Long soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public Long getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Long giaNhap) {
        this.giaNhap = giaNhap;
    }

    public PhieuNhap getPhieuNhap() {
        return phieuNhap;
    }

    public void setPhieuNhap(PhieuNhap phieuNhap) {
        this.phieuNhap = phieuNhap;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuNhap{" +
                "soLuongNhap=" + soLuongNhap +
                ", giaNhap=" + giaNhap +
                ", sach=" + sach +
                ", phieuNhap=" + phieuNhap +
                '}';
    }
}
