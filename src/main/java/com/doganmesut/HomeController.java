package com.doganmesut;

import com.sun.glass.ui.Application;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/**
 * Created by ryuk on 15.01.2017.
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

    @ModelAttribute("version")
    public String getVersion() throws IOException {
        Manifest manif = new Manifest(
                Application.class.getResourceAsStream("/META-INF/MANIFEST.MF"));
        String version = (String) manif.getMainAttributes().get(
                Attributes.Name.IMPLEMENTATION_VERSION);
        return version;
    }
}
