package com.manage.demo.server;

import com.manage.demo.domain.User;

import java.util.List;

public interface UserServer {
        public List<User> getAll();

        public User findById(String id);

        public User addUser(User user);

        public List<User> upUser();

        public void delUser(User user);


}
