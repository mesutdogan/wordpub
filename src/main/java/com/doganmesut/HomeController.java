package com.doganmesut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mesut Dogan
 * @version 0.0.1
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String getLogin(){
        return "index";
    }

    @RequestMapping(value = "/home")
    public String getHome(){

        return "home";
    }
}
