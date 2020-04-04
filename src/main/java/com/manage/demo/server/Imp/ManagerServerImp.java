package com.manage.demo.server.Imp;

import com.manage.demo.dao.ManagerDao;
import com.manage.demo.domain.Manager;
import com.manage.demo.server.ManagerServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "ManagerServer")
class ManagerServerImp implements ManagerServer {
    @Autowired
    public ManagerDao managerDao;
    @Override
    public Manager login(Manager manager) {

        return managerDao.login(manager);
    }

}
