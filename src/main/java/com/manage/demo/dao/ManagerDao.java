package com.manage.demo.dao;

import com.manage.demo.domain.Manager;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerDao {
    public Manager login(Manager manager);
}
