package com.example.web_manager_book.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="KhachHang")
public class Customer {
    @Id
    private int customerId ;
    private String customerName ;
    private String customerEmail ;
    private String customerAddress ;
    private String customerPhone ;

    @OneToMany(mappedBy = "customer")
    private List<HoaDon> soHD ;
}
