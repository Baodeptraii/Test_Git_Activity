package com.example.web_manager_book.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="ChiTietPhieuNhap")
public class ChiTietPhieuNhap {
    private int soLuongNhap;
    private int giaNhap;
    @ManyToOne
    @JoinColumn(name="maSach")
    private Sach sach;
    @Id
    @ManyToOne
    @JoinColumn(name="soPN")
    private PhieuNhap phieuNhap;

}
