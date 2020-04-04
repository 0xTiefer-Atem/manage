package com.manage.demo.server.Imp;

import com.manage.demo.dao.CommodityHomeDao;
import com.manage.demo.server.CommodityHomeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "CommodityHomeServer")
public class CommodityHomeImp implements CommodityHomeServer{
    @Autowired
    private CommodityHomeDao commodityHomeDao;
    @Override
    public int getUs() {

        return commodityHomeDao.getUs();
    }

    @Override
    public int getBr(){
        return commodityHomeDao.getBr();
    }

    @Override
    public int getWa(){
        return commodityHomeDao.getWa();
    }

    @Override
    public int getSs(){
        return commodityHomeDao.getSs();
    }

    @Override
    public int getTo(String date){
        return commodityHomeDao.getTo(date);
    }

    @Override
    public int getYe(String date){
        return commodityHomeDao.getYe(date);
    }

    @Override
    public int getTs(String date){
        return commodityHomeDao.getTs(date);
    }

    @Override
    public int getYs(String date){
        return commodityHomeDao.getYs(date);
    }

    @Override
    public List<String> getSe(){
        return commodityHomeDao.getSe();
    }

}
