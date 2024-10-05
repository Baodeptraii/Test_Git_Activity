package com.example.web_manager_book.Entity;

import jakarta.persistence.*;

@Entity
@Table (name="ChiTietHoaDon")
public class ChiTietHoaDon {
    @Id
    @ManyToOne
    @JoinColumn(name="soHD")
    private HoaDon soHD;

    @ManyToOne
    @JoinColumn(name="MaSach")
    private Sach books;
    private int soLuongBan;
    private int giaBan;
}
