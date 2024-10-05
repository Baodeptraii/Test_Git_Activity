package com.example.web_manager_book.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="TacGia")
public class TacGia {
    @Id
    private int maTG;
    @OneToMany(mappedBy = "tacGia")
    private List<Sach> sach;
    private String tenTG;
    private String lienLac;
}
