package com.manage.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.manage.demo.dao.CommodityDao;
import com.manage.demo.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Commoditys {

    @Autowired
    CommodityDao commodityDao;

//    @RequestMapping(value = "/goods/views" , method = RequestMethod.POST)
//    public JSONArray all(){
//
//        List all = commodityDao.getAll();
//
//        JSONArray resJson= JSONArray.parseArray(all);
//        System.out.println(resJson.toString());
//
//        return resJson;
//    }

    @RequestMapping(value = "/goods/add" , method = RequestMethod.POST)
    public String adds(@RequestBody JSONObject json){
        String s = json.toString();
        System.out.println(s);
//        JSONObject jsonObject = JSONObject.parseObject(s);
        Goods goods = (Goods) JSONObject.parseObject(s,Goods.class);
        System.out.println(goods);
//        commodityDao.add(goods);
        return "t";
    }

    @RequestMapping(value = "/goods/del" , method = RequestMethod.POST)
    public String Goodsdel(String gid){
        gid="qqq";
        if (commodityDao.del(gid)>=1){
            return "t";
        }else {
            return "f";
        }
    }

    @RequestMapping(value = "/goods/up" , method = RequestMethod.POST)
    public void Goodsup(Goods goods){

        commodityDao.up(goods);
    }
}