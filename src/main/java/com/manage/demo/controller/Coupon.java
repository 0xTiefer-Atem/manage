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
public class Coupon {
    @RequestMapping(value = "/coupon/view",method = RequestMethod.POST)
    public String view(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data data = new Data();

        data.setDid("XX");
        data.setNe("XX");
        data.setDi("XX");
        data.setDea("XX");
        data.setQua("XX");

        Message m = new Message();
        m.setRs("t");
        m.setData(data);
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/coupon/add",method = RequestMethod.POST)
    public String add(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/coupon/delete",method = RequestMethod.POST)
    public String delete(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");

        String rs=JSON.toJSONString(m);
        return rs;
    }
}
