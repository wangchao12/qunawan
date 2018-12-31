package me.lindanpeng.qunawan.web.service;

import me.lindanpeng.qunawan.core.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void test(){
        System.out.println(userDao ==null);
        System.out.println(userDao.selectOne(1L).getNickname());
    }
}
