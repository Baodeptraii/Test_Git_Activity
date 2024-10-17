package com.example.web_manager_book.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="TacGia")
public class TacGia {
    @Id
    private Long maTG;
    @OneToMany(mappedBy = "tacGia")
    @JsonIgnore
    private List<Sach> sach;
    private String tenTG;

    public String getLienLac() {
        return lienLac;
    }

    public void setLienLac(String lienLac) {
        this.lienLac = lienLac;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public List<Sach> getSach() {
        return sach;
    }

    public void setSach(List<Sach> sach) {
        this.sach = sach;
    }

    public Long getMaTG() {
        return maTG;
    }

    public void setMaTG(Long maTG) {
        this.maTG = maTG;
    }

    @Override
    public String toString() {
        return "TacGia{" +
                "maTG=" + maTG +
                ", tenTG='" + tenTG + '\'' +
                ", lienLac='" + lienLac + '\'' +
                '}';
    }

    private String lienLac
            ;
}
