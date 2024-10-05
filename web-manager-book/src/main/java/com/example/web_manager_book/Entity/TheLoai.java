package com.example.web_manager_book.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table (name ="TheLoai")
public class TheLoai {
    @OneToMany(mappedBy = "theLoai")
    private List<Sach> books;
    @Id
    private int maTL;
    private String tenTheLoai;

}
