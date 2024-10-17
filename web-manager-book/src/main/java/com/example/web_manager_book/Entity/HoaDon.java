package com.example.web_manager_book.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="HoaDon")
public class HoaDon {
    @Id
    private Long soHD;

    @Override
    public String toString() {
        return "HoaDon{" +
                "soHD=" + soHD +
                ", customer=" + customer +
                ", ngayBan='" + ngayBan + '\'' +
                '}';
    }

    @ManyToOne
    @JoinColumn(name="customerId")
    private Customer customer;
    private String ngayBan;

    @OneToMany(mappedBy = "soHD")
    private List<ChiTietHoaDon> hoaDonList;

    public Long getSoHD() {
        return soHD;
    }

    public void setSoHD(Long soHD) {
        this.soHD = soHD;
    }

    public List<ChiTietHoaDon> getHoaDonList() {
        return hoaDonList;
    }

    public void setHoaDonList(List<ChiTietHoaDon> hoaDonList) {
        this.hoaDonList = hoaDonList;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
