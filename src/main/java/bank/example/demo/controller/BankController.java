package bank.example.demo.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bank.example.demo.entity.HomeLoan;
import bank.example.demo.entity.User;
import bank.example.demo.entity.VehicleLoan;
import bank.example.demo.service.HomeLoanService;
import bank.example.demo.service.UserService;
import bank.example.demo.service.VehicleLoanService;
import bank.example.demo.service.WalletService;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    UserService userService;

    @Autowired
    WalletService walletservice;

    @Autowired
    HomeLoanService homeLoanService;

    @Autowired
    VehicleLoanService vehicleLoanService;

    @PostMapping("/signup")
    public User signUp(@RequestBody User user) {

        return this.userService.createUser(user);
    }

    @PostMapping("/createwallet")
    public int createWallet(@RequestBody String userEmail) {
        return this.walletservice.createWallet(userEmail);
    }

    @PostMapping("/addwalletmoney/{money}")
    public JSONObject addWalletMoney(@RequestBody String userEmail, @PathVariable int money) {
        return this.walletservice.addWalletMoney(userEmail, money);
    }

    @PostMapping("/addHomeLoan/{accountNumber}")
    public int createHomeLoan(@RequestBody HomeLoan homeLoan,@PathVariable Long accountNumber ){
       return this.homeLoanService.createHomeLoan(homeLoan, accountNumber);
    }

    @PostMapping("/addVehicleLoan/{accountNumber}")
    public int createVehicleLoan(@RequestBody VehicleLoan vehicleLoan,@PathVariable Long accountNumber ){
       return this.vehicleLoanService.createVehicleLoan(vehicleLoan, accountNumber);
    }
}