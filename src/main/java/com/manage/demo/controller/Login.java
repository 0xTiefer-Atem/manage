package com.manage.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.manage.demo.dao.ManagerDao;
import com.manage.demo.domain.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @Autowired
    private ManagerDao managerDao;

    @RequestMapping(value = "/home/login",method = RequestMethod.POST)
    public String login(@RequestBody JSONObject jsonObject){
        String s=jsonObject.toString();
        JSONObject json=JSONObject.parseObject(s);
        Manager user=(Manager) JSONObject.parseObject(String.valueOf(json),Manager.class);

        if (managerDao.login(user)!=null){
            return "sucess";
        }else {
            return "error";
        }
    }
}
