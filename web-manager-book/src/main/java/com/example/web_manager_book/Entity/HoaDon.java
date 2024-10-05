package com.example.web_manager_book.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="HoaDon")
public class HoaDon {
    @Id
    private int soHD;
    @ManyToOne
    @JoinColumn(name="customerId")
    private Customer customer;
    private String ngayBan;

    @OneToMany(mappedBy = "soHD")
    private List<HoaDon> hoaDonList;



}
