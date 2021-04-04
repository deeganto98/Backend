package bank.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.example.demo.entity.User;
import bank.example.demo.entity.Wallet;
import bank.example.demo.repository.UserRepository;
import bank.example.demo.repository.WalletRepository;

@Service
public class WalletService {

    @Autowired
    WalletRepository repository;

    @Autowired
    UserRepository repository2;

    Wallet w = new Wallet();
    User user = new User();

    List<Wallet> li = new ArrayList<Wallet>();

    public int createWallet(String userEmail) {
        user = this.repository2.findByemailId(userEmail);
        if (user.getWallet() == null) {
            w.setUser(user);
            w.setWalletOwnerName(user.getFirstName());
            w.setWalletOwnerEmail(user.getEmailId());
            user.setWallet(w);
            repository.save(w);
            return w.getWalletBalance();
        } else {
            return w.getWalletBalance();
        }

    }

    public JSONObject addWalletMoney(String userEmail, int money) {
        user = this.repository2.findByemailId(userEmail);
        w = user.getWallet();
        JSONObject obj = new JSONObject();
        if (money > user.getAccountBalance()) {
            obj.put("message", "Low Account Balance !!");
            obj.put("money", w.getWalletBalance());
            return obj;
        } else {
            user.setAccountBalance(user.getAccountBalance() - money);
            int newMoney = money + w.getWalletBalance();
            w.setWalletBalance(newMoney);
            this.repository2.save(user);
            this.repository.save(w);
            obj.put("message", "Succesfully Added");
            obj.put("money", w.getWalletBalance());
            return obj;
        }
    }
}
