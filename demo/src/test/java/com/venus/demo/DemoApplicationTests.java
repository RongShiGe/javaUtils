package com.venus.demo;

import com.venus.demo.dao.model.User;
import com.venus.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
        User user = new User();
        List<User> userList = userService.findUserList(user);

    }

}
