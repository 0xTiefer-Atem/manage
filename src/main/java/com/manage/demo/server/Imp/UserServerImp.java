package com.manage.demo.server.Imp;

import com.manage.demo.dao.UserDao;
import com.manage.demo.domain.User;
import com.manage.demo.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "UserServer")
class UserServerImp implements UserServer {

    @Autowired
    public UserDao userDao;

    @Override
    public List<User> getAll() {

        return userDao.getAll();
    }

    @Override
    public User findById(String id) {

        return userDao.findById(id);
    }

    @Override
    public User addUser(User user) {

        return userDao.addUser(user);
    }

    @Override
    public List<User> upUser() {

        return userDao.upUser();
    }

    @Override
    public void delUser(User user) {

    }

}