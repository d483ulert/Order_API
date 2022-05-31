package com.my.order.user.service;

import com.my.order.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public void itemAdd() {

    }
}
