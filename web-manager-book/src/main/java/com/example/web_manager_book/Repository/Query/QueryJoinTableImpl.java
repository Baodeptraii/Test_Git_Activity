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
        if(params.get("loaiSach").length()!=0)
            result+= " join the_loai on the_loai.matl= books.matl ";
        if(params.get("tacGia").length()!=0)
            result +=" join tac_gia on tac_gia.matg= books.matg ";
        if(params.get("nhaXuatBan").length()!=0)
            result +=" join nha_xuat_ban on nha_xuat_ban.manxb= books.manxb ";
        return result;
    }
    public String condition(Map<String,String>params)
    {
        String result="";
        if(params.get("loaiSach").length()!=0)
            result+=" and the_loai.ten_the_loai like  '"+params.get("loaiSach")+"' ";
        if(params.get("tacGia").length()!=0)
            result+=" and tac_gia.tentg like  '"+params.get("tacGia")+"' ";
        if(params.get("nhaXuatBan").length()!=0)
            result+=" and nha_xuat_ban.tennxb like  '"+params.get("nhaXuatBan")+"' ";
        if(params.get("tenSach").length()!=0)
            result+=" and books.ten_sach like  '"+params.get("tenSach")+"' ";

        return result;
    }
    @Override
    public List<Sach> getSach(Map<String,String>params) {
        String sql = "select books.* from books ";
        sql+=joinTable(params);
        sql+=" where 1=1 ";
        sql+=condition(params);
        Query query=entityManager.createNativeQuery(sql, Sach.class);
        return query.getResultList();
    }
}
