package me.lindanpeng.qunawan.web.service;

import me.lindanpeng.qunawan.core.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public void test(){
        System.out.println(userMapper ==null);
        System.out.println(userMapper.selectOne(1L).getNickname());
    }
}
