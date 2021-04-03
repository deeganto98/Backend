package bank.example.demo.service;

import java.util.ArrayList;
import java.util.List;

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
    
    public boolean createWallet(String userEmail){
        user = this.repository2.findByemailId(userEmail);
        w.setUser(user);
        w.setWalletOwnerName(user.getFirstName());
        w.setWalletOwnerEmail(user.getEmailId());
        user.setWallet(w);
        repository.save(w);
        return true;
    }
    public int getWalletMoney(String userEmail){
        user = this.repository2.findByemailId(userEmail);
        w = user.getWallet();
        return w.getWalletBalance();
    }
    public int addWalletMoney(String userEmail,int money){
        user = this.repository2.findByemailId(userEmail);
        w = user.getWallet();
        int newMoney = money + w.getWalletBalance();
        w.setWalletBalance(newMoney);
        this.repository.save(w);
        return w.getWalletBalance();
    }
}
