package com.example.web_manager_book.API;

import com.example.web_manager_book.DTO.ThongTinCuaHang;
import com.example.web_manager_book.Entity.Customer;
import com.example.web_manager_book.Entity.Sach;

import com.example.web_manager_book.Repository.Query.SachRepo;
import com.example.web_manager_book.Service.HoaDonService;
import com.example.web_manager_book.Service.ThongTinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class NewAPI {


    @Autowired
    private HoaDonService hoaDonService;

    @Autowired
    private ThongTinService thongTinService;

    @GetMapping("/building/")
    public List<ThongTinCuaHang> getSach(@RequestParam Map<String, String> params)
    {
//        String k=params.get("name").toString();
//        Sach sach=sachRepo.findByTenSachAndMaSach(params.get("Truyen 1").toString(),Long.parseLong(params.get("abc").toString()));


        return thongTinService.getAll();// phần trang chủ có những Quyển sách nào
    }



}
