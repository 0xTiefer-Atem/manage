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
public class Brand {

    @RequestMapping(value = "/brand/view",method = RequestMethod.POST)
    public String view(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Data d2=new Data();//循环加入data数据
        Data d3=new Data();
        d2.setNe("XX");
        d2.setIm("XXX");
        d3.setNe("XX");
        d3.setIm("XXX");
        String rs1=JSON.toJSONString(d2);
        String rs2=JSON.toJSONString(d3);
        Data data=new Data();
        data.newList();
        data.setList(rs1);
        data.setList(rs2);

        Message m=new Message();
        m.setRs("t");
        m.setData(data);
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/brand/add",method = RequestMethod.POST)
    public String add(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/brand/delete",method = RequestMethod.POST)
    public String delete(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/brand/viewList",method = RequestMethod.POST)
    public String  viewList(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        String s1=JSON.toJSONString(d);
        Data d1=new Data();
        d1.newList();
        d1.setList(s1);
        Message m= new Message();
        m.setRs("t");
        m.setData(d1);
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/brand/viewBrand",method = RequestMethod.POST)
    public String viewBrand(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Data d1=new Data();
        d1.setNe("xxx");
        d1.setIm("xxx");

        Data d2=new Data();

        String s2=JSON.toJSONString(d1);
        d2.newList();
        d2.setList(s2);

        Message m=new Message();
        m.setData(d2);
        m.setRs("t");
        String s=JSON.toJSONString(m);
        return s;
    }

    @RequestMapping(value = "/brand/deleteBrand",method = RequestMethod.POST)
    public String deleteBrand(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        Message m= new Message();
        m.setRs("t");
//        m.setData(d);
        String s=JSON.toJSONString(m);
        return s;
    }

}
