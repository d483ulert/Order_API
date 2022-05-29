package com.my.order.user.service;

import com.my.order.user.entity.UserEntity;
import java.util.List;

public interface UserService {

    public List<UserEntity> list();

    public void itemAdd();


}
