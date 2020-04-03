package com.manage.demo.dao;

import com.manage.demo.domain.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommodityDao {

//    public String getGid();
//    public String getOne();
//    public String getTow();
//    public String getThree();
//    public String getbrand();
//    public String getTitle();
//    public String getDescription();
//    public String getDiscount();
//    public String getPrice();
//    public String getPr_code();
//    public String getColor();
//    public String getSize();
//    public String getIm();
    List<Goods> getAll();

    void up(Goods goods);

    void add(Goods goods);

    int del(String gid);
}
