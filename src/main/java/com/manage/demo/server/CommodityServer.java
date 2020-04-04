package com.manage.demo.server;

import com.manage.demo.domain.Goods;

import java.util.List;

public interface CommodityServer {

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

    int del(String gid);

    void up(Goods goods);

    void add(Goods goods);
}
