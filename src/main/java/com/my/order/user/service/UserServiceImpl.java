package com.my.order.user.service;

import com.my.order.user.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Override
    public List<UserEntity> list() {
        return null;
    }

    @Override
    public void itemAdd() {

    }
}
