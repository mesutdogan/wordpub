package com.doganmesut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordpublisherApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setEmail("doganmesut01@gmail.com");
        user.setFullName("Mesut Doğan");
        user = userService.save(user);
        Assert.assertTrue(user!=null);
    }

}
