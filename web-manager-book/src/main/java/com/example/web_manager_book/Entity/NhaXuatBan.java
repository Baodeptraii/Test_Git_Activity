package com.example.web_manager_book.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="NhaXuatBan")
public class NhaXuatBan {
    @Id
    private Long maNXB;
    @OneToMany(mappedBy = "nhaXuatBan")
    @JsonIgnore
    private List<Sach> sachList;
    private String tenNXB;
    private String diaChiNXB;
    private String dienThoai;
    @OneToMany(mappedBy = "soPN")
    @JsonIgnore
    private List<PhieuNhap> phieuNhapList;

    public Long getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(Long maNXB) {
        this.maNXB = maNXB;
    }

    public List<Sach> getSachList() {
        return sachList;
    }

    public void setSachList(List<Sach> sachList) {
        this.sachList = sachList;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public String getDiaChiNXB() {
        return diaChiNXB;
    }

    public void setDiaChiNXB(String diaChiNXB) {
        this.diaChiNXB = diaChiNXB;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public List<PhieuNhap> getPhieuNhapList() {
        return phieuNhapList;
    }

    public void setPhieuNhapList(List<PhieuNhap> phieuNhapList) {
        this.phieuNhapList = phieuNhapList;
    }

    @Override
    public String toString() {
        return "NhaXuatBan{" +
                "maNXB=" + maNXB +
                ", tenNXB='" + tenNXB + '\'' +
                ", diaChiNXB='" + diaChiNXB + '\'' +
                ", dienThoai='" + dienThoai + '\'' +
                '}';
    }
}
