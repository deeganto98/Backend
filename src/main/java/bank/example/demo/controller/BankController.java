package bank.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bank.example.demo.entity.User;
import bank.example.demo.repository.UserRepository;


@RestController
@RequestMapping("/bank")
public class BankController {
    
    @Autowired
    UserRepository repo;
    
    @PostMapping("/signup")
    public User signUp(@RequestBody User user){
        user.setAccountNumber((long)(Math.random() * 90000000) + 10000000);
        return repo.save(user);
    }
}
