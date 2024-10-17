package com.example.web_manager_book.Service;
import com.example.web_manager_book.Converter.ConvertThongTinDTO;
import com.example.web_manager_book.DTO.ThongTinCuaHang;
import com.example.web_manager_book.Entity.Sach;
import com.example.web_manager_book.Repository.Query.SachRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Component
public class ThongTinServiceImpl implements ThongTinService {

    @Autowired
    private SachRepo sachRepo;
    @Autowired
    private ConvertThongTinDTO convertThongTinDTO;
    @Override
    public List<ThongTinCuaHang> getAll() {
        List<Sach> sachList = sachRepo.findAll();
        List<ThongTinCuaHang> thongTinCuaHangList = new ArrayList<>();
        for (Sach sach : sachList) {
            ThongTinCuaHang tmpThongTinCuaHang = new ThongTinCuaHang();
            thongTinCuaHangList.add(convertThongTinDTO.convertThongTinDTO(sach));
        }
        return thongTinCuaHangList;
    }
}
