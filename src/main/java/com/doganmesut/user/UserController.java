package com.doganmesut.user;

import com.doganmesut.dictionary.Dictionary;
import com.doganmesut.dictionary.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Mesut Dogan <doganmesut01@gmail.com>
 * @version 0.0.1
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping("/authenticated")
    public Principal user(Principal principal) {
        return principal;
    }


    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public User getUser(@RequestParam String email) {
        if (userService.findByEmail(email) == null) {
            User newUser = new User();
            newUser.setEmail(email);
            Dictionary newDictionary = new Dictionary();
            dictionaryService.save(newDictionary);
            newUser.setDictionary(newDictionary);
            userService.save(newUser);
        }
        return userService.findByEmail(email);
    }
}
