package com.manage.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.manage.demo.pojo.Data;
import com.manage.demo.pojo.Message;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Order {
    @RequestMapping(value = "/order/delivery", method = RequestMethod.POST)
    public String delivery(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data d2 = new Data();
        d2.setOid("xx");
        d2.setNm("xx");
        d2.setQua("xx");
        d2.setAct("xxx");
        d2.setTim("xx");

        Message m = new Message();
        m.setRs("t");
        m.setData(d2);
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/order/detail", method = RequestMethod.POST)
    public String detail(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data d2 = new Data();
        d2.setNm("xx");
        d2.setNam("xx");
        d2.setQua("xx");
        d2.setCol("xx");
        d2.setSiz("xx");
        d2.setPri("xx");
        d2.setDis("xx");
        d2.setAct("xx");
        d2.setTim("xx");
        Message m = new Message();
        m.setRs("t");
        m.setData(d2);
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/order/undelivery", method = RequestMethod.POST)
    public String undelivery(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data d2 = new Data();
        d2.setOid("xx");
        d2.setNm("xx");
        d2.setQua("xx");
        d2.setAct("xxx");
        d2.setTim("xxx");
        Message m = new Message();
        m.setRs("t");
        m.setData(d2);
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/order/unpay", method = RequestMethod.POST)
    public String unpay(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data d2 = new Data();
        d2.setOid("xx");
        d2.setNm("xx");
        d2.setQua("xx");
        d2.setAct("xx");
        d2.setTim("xx");
        Message m = new Message();
        m.setRs("t");
        m.setData(d2);
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/order/other", method = RequestMethod.POST)
    public String other(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data d2 = new Data();
        d2.setOid("xx");
        d2.setNm("xx");
        d2.setQua("xx");
        d2.setAct("xx");
        d2.setTim("xx");
        Message m = new Message();
        m.setRs("t");
        m.setData(d2);
        String s = JSON.toJSONString(m);
        return s;
    }

}
