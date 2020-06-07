package guru.springframework.petclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})//match all of these url patterns
    public String index(){
        return "index";
    }
}
