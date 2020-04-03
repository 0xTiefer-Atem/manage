package com.manage.demo.dao;

import com.manage.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    public List<User> getAll();

    public User findById(String id);

    public User addUser(User user);

    public List<User> upUser();

    public void delUser(User user);

}
