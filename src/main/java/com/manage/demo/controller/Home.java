package com.manage.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.manage.demo.dao.CommodityHomeDao;
import com.manage.demo.dao.UserDao;
import com.manage.demo.util.DateString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author sar
 */
@RestController
public class Home {

    @Autowired
    private CommodityHomeDao commodityHomeDao;
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "user/all" , method = RequestMethod.POST)
    public String userall(){

        List user = userDao.getAll();
        System.out.println(user);

        return "t";
    }
    @RequestMapping(value = "/user/add" , method = RequestMethod.POST)
    public void useradd(){

    }
    @RequestMapping(value = "/home/all" , method = RequestMethod.POST)
    public JSONObject homeall() {

//      用户总数
        int us = commodityHomeDao.getUs();

//      品牌数
        int br = commodityHomeDao.getBr();

//      出售总数 isdelivery  1为已出售
        int ss = commodityHomeDao.getSs();

//      待发货的数量 isPay  1为已支付
        int wa = commodityHomeDao.getWa();

//      今日注册的数量
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String to = sdf.format(date);
        int s = commodityHomeDao.getTo(to);

//      昨日注册的数量
        String ye = DateString.getSpecifiedDayBefore(sdf.format(date));
        int s1 = commodityHomeDao.getYe(ye);

//      今日出售的数量
        String ts = sdf.format(date);
        int s2 = commodityHomeDao.getTs(ts);

//      昨日出售的数量
        String ys = DateString.getSpecifiedDayBefore(sdf.format(date));
        int s3 = commodityHomeDao.getYs(ys);

//      出售中的商品 actual 1为出售中
        List<String> s4 = commodityHomeDao.getSe();

        String res="{\"d\":{" +
                "\"用户总数\":\""+us+"\",\"昨日注册的数量\":\""+s1+"\",\"今日注册的数量\":\""+s+"\",\"出售总数\":\""+ss+"\",\"昨日出售的数量\":\""+s3+"\"," +
                "\"今日出售的数量\":\""+s2+"\",\"待发货的数量\":\""+wa+"\",\"出售中\":\""+s4+"\",\"品牌数\":\""+br+"\"}}";

        JSONObject resJson= JSON.parseObject(res);

        return resJson;
    }
}