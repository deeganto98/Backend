package bank.example.demo.controller;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bank.example.demo.entity.User;

@RestController("/bank")
public class MainController {

    @RequestMapping("/signup")
    public User signUp(@ModelAttribute("user") User user){
        
        return user;
    }

   
}
