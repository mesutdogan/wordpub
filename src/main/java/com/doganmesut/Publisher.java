package com.doganmesut;

import com.doganmesut.user.User;
import com.doganmesut.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

/**
 * Created by ryuk on 26.01.2017.
 */
public class Publisher {

    @Autowired
    private UserService userService;

    @Scheduled(cron = "0 * * * * *")
    public void publishNotification(){
        List<User> users = userService.findAll();

        for (User user : users) {
            // not implemented yet.
        }
    }
}
