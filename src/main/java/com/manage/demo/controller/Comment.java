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
public class Comment {
    @RequestMapping(value = "/comment/view",method = RequestMethod.POST)
    public String view(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        String uid=d.getUid();
        Data d2=new Data();
        d2.setUid("XX");
        d2.setCid("XXX");
        d2.setNm("XX");
        d2.setNam("XX");
        d2.setCom("XXXXX");
        Message m=new Message();
        m.setRs("t");
        m.setData(d2);
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/comment/delete",method = RequestMethod.POST)
    public String delete(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        String uid=d.getUid();
        String cid=d.getCid();
        Message m=new Message();
        m.setRs("t");
        String rs=JSON.toJSONString(m);
        return rs;
    }

}
