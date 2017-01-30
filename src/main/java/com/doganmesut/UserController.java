package com.doganmesut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ryuk on 26.01.2017.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public User getUser(@RequestParam String email){
        return userService.findByEmail(email);
    }
}
