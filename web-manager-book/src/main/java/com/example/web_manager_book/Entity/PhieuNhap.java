package com.example.web_manager_book.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="PhieuNhap")
public class PhieuNhap {
    @Id
    private Long soPN;
    private String ngayNhap;
    @ManyToOne
    @JoinColumn(name="maNXB")
    private NhaXuatBan maNXB;
    @OneToMany(mappedBy = "phieuNhap")
    @JsonIgnore
    private List<ChiTietPhieuNhap> phieuNhapList;

    public List<ChiTietPhieuNhap> getPhieuNhapList() {
        return phieuNhapList;
    }

    public void setPhieuNhapList(List<ChiTietPhieuNhap> phieuNhapList) {
        this.phieuNhapList = phieuNhapList;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Long getSoPN() {
        return soPN;
    }

    public void setSoPN(Long soPN) {
        this.soPN = soPN;
    }

    public NhaXuatBan getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(NhaXuatBan maNXB) {
        this.maNXB = maNXB;
    }

    @Override
    public String toString() {
        return "PhieuNhap{" +
                "soPN=" + soPN +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", maNXB=" + maNXB +
                '}';
    }
}
