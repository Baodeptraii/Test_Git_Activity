package com.example.web_manager_book.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
//
@Entity
@Table(name ="Books")
public class Sach {
    @Id
    private Long maSach;
    @OneToMany(mappedBy = "books")
    @JsonIgnore
    private List<ChiTietHoaDon> chiTietHoaDons;
    private Long giaBan;

    private String tenSach;
    @ManyToOne
    @JoinColumn(name="maTL")
    private TheLoai theLoai;
    @ManyToOne
    @JoinColumn(name="maTG")
    private TacGia tacGia;
    private Long soLuongTon;
    @ManyToOne
    @JoinColumn(name="maNXB")
    private NhaXuatBan nhaXuatBan;
    @OneToMany(mappedBy = "sach")
    private List<ChiTietPhieuNhap> listChiTietPhieuNhap;

    public Long getMaSach() {
        return maSach;
    }

    public void setMaSach(Long maSach) {
        maSach = maSach;
    }

    public List<ChiTietPhieuNhap> getListChiTietPhieuNhap() {
        return listChiTietPhieuNhap;
    }

    public void setListChiTietPhieuNhap(List<ChiTietPhieuNhap> listChiTietPhieuNhap) {
        this.listChiTietPhieuNhap = listChiTietPhieuNhap;
    }

    public NhaXuatBan getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(NhaXuatBan nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public Long getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Long soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public TheLoai getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(TheLoai theLoai) {
        this.theLoai = theLoai;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public List<ChiTietHoaDon> getChiTietHoaDons() {
        return chiTietHoaDons;
    }

    public void setChiTietHoaDons(List<ChiTietHoaDon> chiTietHoaDons) {
        this.chiTietHoaDons = chiTietHoaDons;
    }

    public Long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Long giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "MaSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", theLoai=" + theLoai +
                ", tacGia=" + tacGia +
                ", soLuongTon=" + soLuongTon +
                ", nhaXuatBan=" + nhaXuatBan +
                '}';
    }
}
