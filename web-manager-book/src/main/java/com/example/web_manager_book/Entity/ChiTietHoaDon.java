package com.example.web_manager_book.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table (name="ChiTietHoaDon")
public class ChiTietHoaDon {
    @Id
    @ManyToOne
    @JoinColumn(name="soHD")
    @JsonIgnore
    private HoaDon soHD;

    @ManyToOne
    @JoinColumn(name="MaSach")
    private Sach books;
    private Long soLuongBan;

    public HoaDon getSoHD() {
        return soHD;
    }

    public void setSoHD(HoaDon soHD) {
        this.soHD = soHD;
    }

    public Sach getBooks() {
        return books;
    }

    public void setBooks(Sach books) {
        this.books = books;
    }

    public Long getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(Long soLuongBan) {
        this.soLuongBan = soLuongBan;
    }





    @Override
    public String toString() {
        return "ChiTietHoaDon{" +
                "soHD=" + soHD +
                ", books=" + books +
                ", soLuongBan=" + soLuongBan +
                ", giaBan=" +
                '}';
    }
}
