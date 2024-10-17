package com.example.web_manager_book.Repository.Query;

import com.example.web_manager_book.Entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface SachRepo extends JpaRepository<Sach, Integer> ,QueryJoinTable{
    Sach findByTenSach(String name);
    Sach findByTenSachAndMaSach(String tenSach, Long maSach);
}
