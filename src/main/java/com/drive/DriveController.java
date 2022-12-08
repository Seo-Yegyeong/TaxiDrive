package com.drive;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DriveController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "main", method = RequestMethod.GET)
    public void showMain(){

    }
}