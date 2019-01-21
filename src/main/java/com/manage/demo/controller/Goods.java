package com.manage.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.manage.demo.pojo.Data;
import com.manage.demo.pojo.Message;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class Goods {
    @RequestMapping(value = "/goods/views",method = RequestMethod.POST)
    public String views(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        Data d2=new Data();
        d2.setGid("XX");
        d2.setNam("XXX");
        d2.setOne("XXX");
        String rm1=JSON.toJSONString(d2);
        Data data=new Data();
        data.newList();
        data.setList(rm1);
        Message m=new Message();

        m.setRs("t");
        m.setData(data);
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/goods/image",method = RequestMethod.POST)
    public String image(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);
        Message m=new Message();
        Data data=new Data();
        Data d2=new Data();
        d2.setIm("XXXX");
        String rm1=JSON.toJSONString(d2);
        data.newList();
        data.setList(rm1);
        m.setRs("t");
        m.setData(data);
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/goods/delete",method = RequestMethod.POST)
    public String delete(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/goods/uploadSingle",method = RequestMethod.POST)
    public String uploadSingle(@RequestBody JSONObject json){
        Data d= JSON.parseObject(json.toString(),Data.class);

        Message m=new Message();
        m.setRs("t");
        String rs=JSON.toJSONString(m);
        return rs;
    }

    @RequestMapping(value = "/goods/uploadCsv",method = RequestMethod.POST)
    public String uploadCsv(MultipartFile file) throws IOException {
        Message m=new Message();
        String filename=file.getOriginalFilename();
        String postfix = filename.substring(filename.lastIndexOf(".")+1);
        System.out.println(postfix);
        if(postfix=="csv"){
            m.setRs("t");
        }else{
           m.setRs("f");
        }
        String rs=JSON.toJSONString(m);
        return rs;
    }


}
