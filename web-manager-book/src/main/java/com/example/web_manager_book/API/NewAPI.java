package com.example.web_manager_book.API;

import com.example.web_manager_book.DTO.ThongTinCuaHang;
import com.example.web_manager_book.Entity.Customer;
import com.example.web_manager_book.Entity.Sach;

import com.example.web_manager_book.Repository.Query.QueryJoinTable;
import com.example.web_manager_book.Repository.Query.SachRepo;
import com.example.web_manager_book.Service.HoaDonService;
import com.example.web_manager_book.Service.ThongTinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
public class NewAPI {


    @Autowired
    private HoaDonService hoaDonService;

    @Autowired
    private ThongTinService thongTinService;

    @Autowired
    private SachRepo sachRepo;
//    @GetMapping("")//hiển thị thông tin cửa hàng
//    public ModelAndView layToanBoSach(@RequestParam Map<String, String> params)
//    {
////        String k=params.get("name").toString();
////        Sach sach=sachRepo.findByTenSachAndMaSach(params.get("Truyen 1").toString(),Long.parseLong(params.get("abc").toString()));
//        List<ThongTinCuaHang> thongTinCuaHangList=thongTinService.getAll();
//        ModelAndView modelAndView=new ModelAndView("index");
//        modelAndView.addObject("list",thongTinCuaHangList);
//        return modelAndView;// phần trang chủ có những Quyển sách nào
//    }
    @GetMapping("/timkiem/")
    public ModelAndView timSach(@RequestParam Map<String, String> params)
    {
        ModelAndView modelAndView=new ModelAndView("timsach");
        List<ThongTinCuaHang> list;
        if (params.size()==0)
        {
            list =thongTinService.getAll();
        }
        else{
            list=thongTinService.getListSach(params);
        }



        modelAndView.addObject("list",list);
        return modelAndView;
    }
    @GetMapping("")
    public ModelAndView timKiem()
    {
        return new ModelAndView("thongtintimkiem");
    }



}
