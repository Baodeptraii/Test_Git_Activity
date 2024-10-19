package com.example.web_manager_book.Repository.Query;

import com.example.web_manager_book.Entity.Sach;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

public interface QueryJoinTable {
    public List<Sach> getSach(Map<String,String>params);
}
