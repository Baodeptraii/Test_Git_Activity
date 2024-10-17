package com.example.web_manager_book.Service;

import com.example.web_manager_book.DTO.ThongTinCuaHang;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ThongTinService {
    List<ThongTinCuaHang> getAll();
}
