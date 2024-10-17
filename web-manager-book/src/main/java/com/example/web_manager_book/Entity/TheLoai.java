package com.example.web_manager_book.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table (name ="TheLoai")
public class TheLoai {
    @OneToMany(mappedBy = "theLoai")
    @JsonIgnore
    private List<Sach> books;
    @Id
    private Long maTL;
    private String tenTheLoai;

    public List<Sach> getBooks() {
        return books;
    }

    public void setBooks(List<Sach> books) {
        this.books = books;
    }

    public Long getMaTL() {
        return maTL;
    }

    public void setMaTL(Long maTL) {
        this.maTL = maTL;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    @Override
    public String toString() {
        return "TheLoai{" +
                "maTL=" + maTL +
                ", tenTheLoai='" + tenTheLoai + '\'' +
                '}';
    }
}
