package com.wen.impl;

import com.wen.po.User;
import com.wen.service.UserService;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Override
    public User get(String id) {
        System.out.println("收到get请求：id— — >"+id);
        User u=new User();
        u.setUserid(id);
        u.setName("get");
        u.setPassword("123");
        return u;
    }

    @Override
    public User post(String id, User user) {
        System.out.println("收到post请求：id— — >"+id);
        user.setUserid(id);
        user.setName("post");
        user.setPassword("123");
        return user;
    }

    @Override
    public User put(String id, User user) {
        System.out.println("收到put请求：id— — >"+id);
        user.setUserid("update");
        user.setName("123");
        return user;
    }


    @Override
    public void delete(String id) {
        System.out.println("收到delete请求：id— — >"+id);
    }
}
