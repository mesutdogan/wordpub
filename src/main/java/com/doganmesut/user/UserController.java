package com.doganmesut.user;

import com.doganmesut.dictionary.Dictionary;
import com.doganmesut.dictionary.DictionaryService;
import com.doganmesut.word.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Created by ryuk on 26.01.2017.
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
