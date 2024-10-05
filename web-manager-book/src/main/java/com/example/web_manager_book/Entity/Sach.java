package com.example.web_manager_book.Entity;

import jakarta.persistence.*;

import java.util.List;
//
@Entity
@Table(name ="Books")
public class Sach {
    @Id
    private int MaSach;
    @OneToMany(mappedBy = "books")
    private List<ChiTietHoaDon> chiTietHoaDons;
    private String tenSach;
    @ManyToOne
    @JoinColumn(name="maTL")
    private TheLoai theLoai;
    @ManyToOne
    @JoinColumn(name="maTG")
    private TacGia tacGia;
    private int soLuongTon;
    @ManyToOne
    @JoinColumn(name="maNXB")
    private NhaXuatBan nhaXuatBan;
    @OneToMany(mappedBy = "sach")
    private List<ChiTietPhieuNhap> listChiTietPhieuNhap;
}
