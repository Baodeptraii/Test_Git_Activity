package com.example.web_manager_book.Entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="PhieuNhap")
public class PhieuNhap {
    @Id
    private int soPN;
    private String ngayNhap;
    @ManyToOne
    @JoinColumn(name="maNXB")
    private NhaXuatBan maNXB;
    @OneToMany(mappedBy = "phieuNhap")
    private List<ChiTietPhieuNhap> phieuNhapList;



}
