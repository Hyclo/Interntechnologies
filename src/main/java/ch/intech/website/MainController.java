package ch.intech.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String home(){
        return "index";
    }

    @GetMapping("/error")
    public String error(){
        return "index";
    }



}
