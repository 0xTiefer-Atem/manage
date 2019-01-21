package com.manage.demo.controller;

import java.util.List;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.manage.demo.pojo.Data;
import com.manage.demo.pojo.Message;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class module {
    @RequestMapping(value = "/module/banner", method = RequestMethod.POST)
    public String banner(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data d2 = new Data();
        Data d3 = new Data();
        d2.setNe("XXX");
        d2.setIm("XXX");
        d2.setLik("XXX");
        d3.setNe("XXX");
        d3.setLik("XXX");
        d3.setIm("XXX");
        String rm1=JSON.toJSONString(d2);
        String rm2=JSON.toJSONString(d3);
        Data data=new Data();
        data.newList();
        data.setList(rm1);
        data.setList(rm2);
        Message m = new Message();
        m.setRs("t");
        m.setData(data);
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/DeleteBanner", method = RequestMethod.POST)
    public String DeleteBanner(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Message m = new Message();
        m.setRs("t");
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/AlterBanner", method = RequestMethod.POST)
    public String AlterBanner(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Message m = new Message();
        m.setRs("t");
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/AddBanner", method = RequestMethod.POST)
    public String AddBanner(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data d2 = new Data();
        Message m = new Message();
        m.setRs("t");
        m.setData(d2);
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/home", method = RequestMethod.POST)
    public String home(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data d2 = new Data();
        Data d3 = new Data();
        d2.setNe("xx");
        d2.setIm("xx");
        d2.setLik("xx");
        d3.newList();
        d3.getList().add(JSON.toJSONString(d2));
        Message m = new Message();
        m.setRs("t");
        m.setData(d3);
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/AlterHome", method = RequestMethod.POST)
    public String AlterHome(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Message m = new Message();
        m.setRs("t");
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/goods", method = RequestMethod.POST)
    public String goods(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Data d2 = new Data();
        Data d3 = new Data();
        d2.setGid("xx");
        d2.setNam("xx");
        d2.setIm("xx");
        d3.newList();
        d3.getList().add(JSON.toJSONString(d2));
        Message m = new Message();
        m.setRs("t");
        m.setData(d3);
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/title", method = RequestMethod.POST)
    public String title(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Message m = new Message();
        m.setRs("t");
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/addGoods", method = RequestMethod.POST)
    public String addGoods(@RequestBody JSONObject json) {
        Data d = JSON.parseObject(json.toString(), Data.class);
        Message m = new Message();
        m.setRs("t");
        String s = JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/man(wom)",method = RequestMethod.POST)
    public String man(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        Data d1 =new Data();
        d1.setNe("xxx");
        d1.setIm("xxx");
        d1.setLik("xxx");

        String s1=JSON.toJSONString(d1);

        Data d2=new Data();
        d2.newList();
        d2.setList(s1);

        Message m=new Message();
        m.setData(d);
        m.setData(d2);
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/alterMan(Women)",method = RequestMethod.POST)
    public String alterMan(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/mans(womens)",method = RequestMethod.POST)
    public String mans(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Data d1=new Data();
        d1.setGid("xxx");
        d1.setNam("xxx");
        d1.setIm("xxx");

        String s1=JSON.toJSONString(d1);

        Data d2=new Data();
        d2.newList();
        d2.setList(s1);

        Message m=new Message();
        m.setData(d);
        m.setData(d2);
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/addMans(Womens)",method = RequestMethod.POST)
    public String addMans(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/new",method = RequestMethod.POST)
    public String  New(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        Data d1 =new Data();
        d1.setNe("xxx");
        d1.setIm("xxx");
        d1.setLik("xxx");

        String s1=JSON.toJSONString(d1);

        Data d2=new Data();
        d2.newList();
        d2.setList(s1);

        Message m=new Message();
        m.setData(d);
        m.setData(d2);
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/alterNews",method = RequestMethod.POST)
    public String alterNews(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/child",method = RequestMethod.POST)
    public String child(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        Data d1 =new Data();
        d1.setNe("xxx");
        d1.setIm("xxx");
        d1.setLik("xxx");

        String s1=JSON.toJSONString(d1);

        Data d2=new Data();
        d2.newList();
        d2.setList(s1);

        Message m=new Message();
        m.setData(d);
        m.setData(d2);
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/alterChild",method = RequestMethod.POST)
    public String  alterChild(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/childsGoods",method = RequestMethod.POST)
    public String childsGoods(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        Data d1 =new Data();
        d1.setGid("xxx");
        d1.setNam("xxx");
        d1.setIm("xxx");

        String s1=JSON.toJSONString(d1);

        Data d2=new Data();
        d2.newList();
        d2.setList(s1);

        Message m=new Message();
        m.setData(d);
        m.setData(d2);
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/addChilds",method = RequestMethod.POST)
    public String  AddChilds(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/module/others",method = RequestMethod.POST)
    public String  other(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        Data d1=new Data();
        d1.setNe("xxx");
        d1.setIm("xxx");
        d1.setLik("xxx");

        String s1=JSON.toJSONString(d1);

        Data d2 = new Data();
        d2.newList();
        d2.setList(s1);

        Message m=new Message();
        m.setData(d);
        m.setData(d2);
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }
}
