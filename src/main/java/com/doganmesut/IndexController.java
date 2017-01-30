package com.doganmesut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ryuk on 15.01.2017.
 */

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public String getIndex(){

        return "index2";
    }
}
