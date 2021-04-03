package bank.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Wallet {
    @Id
    @GenericGenerator(name = "txn_generator", strategy = "bank.example.demo.generators.WalletIdGenerator")
    @GeneratedValue(generator = "txn_generator")
    @Column(length = 64)
    private String walletId;
    private String walletOwnerName;
    private int walletBalance;
    @Column(unique = true)
    private String walletOwnerEmail;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "wallet")
    private User user;

    public Wallet() {
    }

    public Wallet(String walletId, String walletOwnerName, int walletBalance, User user) {
        this.walletId = walletId;
        this.walletOwnerName = walletOwnerName;
        this.walletBalance = walletBalance;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getWalletOwnerName() {
        return walletOwnerName;
    }

    public void setWalletOwnerName(String walletOwnerName) {
        this.walletOwnerName = walletOwnerName;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Wallet [user=" + user + ", walletBalance=" + walletBalance + ", walletId=" + walletId
                + ", walletOwnerName=" + walletOwnerName + "]";
    }

    public String getWalletOwnerEmail() {
        return walletOwnerEmail;
    }

    public void setWalletOwnerEmail(String walletOwnerEmail) {
        this.walletOwnerEmail = walletOwnerEmail;
    }
}
