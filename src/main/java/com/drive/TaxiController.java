package com.drive;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaxiController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

}
