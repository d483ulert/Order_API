package com.my.order.user;
import com.my.order.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {


    @Autowired
    private UserRepository userRepository;



}
