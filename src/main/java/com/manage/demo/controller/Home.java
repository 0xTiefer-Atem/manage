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
public class Home {

    @RequestMapping(value = "/home/login",method = RequestMethod.POST)
    public String login(@RequestBody JSONObject json){
        Data d = JSON.parseObject(json.toString(),Data.class);

        Data d2 = new Data();
        d2.setUid("xxxx");
        Message m = new Message();
        m.setRs("t");
        m.setData(d2);
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/home/show",method = RequestMethod.POST)
    public String   show(@RequestBody JSONObject json){
        Data d = JSON.parseObject(json.toString(),Data.class);
        Data d2 = new Data();
        d2.setUs("xx");
        d2.setYe("xx");
        d2.setTo("xx");
        d2.setSs("xx");
        d2.setYs("xx");
        d2.setTs("xx");
        d2.setWa("xx");
        d2.setSe("xx");
        d2.setBr("xx");
        Message m = new Message();
        m.setRs("t");
        m.setData(d2);
        String s = JSON.toJSONString(m);
        return s;
    }
}
