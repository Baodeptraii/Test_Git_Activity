package com.example.web_manager_book.Converter;

import com.example.web_manager_book.DTO.BuildingDTO;
import com.example.web_manager_book.DTO.ThongTinCuaHang;
import com.example.web_manager_book.Entity.Sach;
import org.springframework.stereotype.Component;

@Component
public class ConvertThongTinDTO {
    public ThongTinCuaHang convertThongTinDTO(Sach sach) {

        ThongTinCuaHang thongTinCuaHang = new ThongTinCuaHang();
        thongTinCuaHang.setMaSach(sach.getMaSach());
        thongTinCuaHang.setTenSach(sach.getTenSach());
        thongTinCuaHang.setTheLoai(sach.getTheLoai().getTenTheLoai());
        thongTinCuaHang.setTacGia(sach.getTacGia().getTenTG());
        thongTinCuaHang.setTenNXB(sach.getNhaXuatBan().getTenNXB());
        thongTinCuaHang.setSoLuong(sach.getSoLuongTon());
        thongTinCuaHang.setGiaBan(sach.getGiaBan());
        return thongTinCuaHang;
    }

}
