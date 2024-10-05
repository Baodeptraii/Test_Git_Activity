package com.example.web_manager_book.API;

import com.example.web_manager_book.Repository.Query.QueryIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAPI {


    @Autowired
    private QueryIF query;

    @GetMapping(value = "/test")
    public  String createCustomer()
    {
//        Customer customer = query.getReferenceById(1L);
//
//        String k=customer.toString();
//        for(HoaDon hoaDon:customer.getCustomer_hoadon())
//        {
//            k+=hoaDon.toString();
//        }
        return "Oke";
    }
}
