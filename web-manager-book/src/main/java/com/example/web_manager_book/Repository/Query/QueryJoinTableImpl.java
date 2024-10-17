package com.example.web_manager_book.Repository.Query;

import com.example.web_manager_book.Entity.Sach;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryJoinTableImpl implements QueryJoinTable {

    @PersistenceContext
    private EntityManager entityManager;



    public String joinTable(Map<String,String>params)
    {
        String result="";
        if(params.get("loai sach")!=null)
            result+= " join the_loai on the_loai.matl= books.matl ";
        if(params.get("tac gia")!=null)
            result +=" join tac_gia on tac_gia.matg= books.matg ";
        if(params.get("nha xuat ban")!=null)
            result +=" join nha_xuat_ban on nha_xuat_ban.manxb= books.manxb ";
        return result;
    }

    @Override
    public List<Sach> getSach(Map<String,String>params) {
        String sql = "select books.*, tac_gia.matg AS matg_tacgia, the_loai.matl AS matl_theloai from books ";
        sql+=joinTable(params);
        sql+=" where 1=1 ";
        Query query=entityManager.createNativeQuery(sql, Sach.class);
        return query.getResultList();
    }
}
