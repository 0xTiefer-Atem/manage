package com.manage.demo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sar
 */
@Repository
public interface CommodityHomeDao {

    public int getUs();
    public int getBr();
    public int getWa();
    public int getSs();
    public int getTo(String date);
    public int getYe(String date);
    public int getTs(String date);
    public int getYs(String date);
    public List<String> getSe();

}
