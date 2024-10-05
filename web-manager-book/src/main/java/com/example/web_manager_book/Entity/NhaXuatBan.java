package com.example.web_manager_book.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="NhaXuatBan")
public class NhaXuatBan {
    @Id
    private int maNXB;
    @OneToMany(mappedBy = "nhaXuatBan")
    private List<Sach> sachList;
    private String tenNXB;
    private String diaChiNXB;
    private String dienThoai;
    @OneToMany(mappedBy = "soPN")
    private List<PhieuNhap> phieuNhapList;
}
