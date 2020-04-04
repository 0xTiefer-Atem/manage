package com.manage.demo.server;

import java.util.List;

public interface CommodityHomeServer {

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
