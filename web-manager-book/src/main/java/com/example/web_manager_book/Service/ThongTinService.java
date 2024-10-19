package com.example.web_manager_book.Service;

import com.example.web_manager_book.DTO.ThongTinCuaHang;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ThongTinService {
    List<ThongTinCuaHang> getAll();
    List<ThongTinCuaHang> getListSach(Map<String,String> params);
}
