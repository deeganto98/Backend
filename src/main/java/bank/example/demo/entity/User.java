package bank.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {
    @Id
    @GenericGenerator(name="userid_generator",strategy="bank.example.demo.generators.UserIdGenerator")
    @GeneratedValue(generator = "userid_generator")
    @Column(length = 64)
    private String userId;
    private Long accountNumber;
    @Column(length = 255)
    private String firstName;
    @Column(length = 255)
    private String lastName;
    
    private String emailId;

    private int accountBalance;

    private String userName;

    @OneToOne
    @JoinColumn(name="walletId")
    private Wallet wallet;

    @OneToOne
    @JoinColumn(name="homeLoanId")
    private HomeLoan homeLoan;

    private String branchName;

    @OneToOne
    @JoinColumn(name="vehicleLoanId")
    private VehicleLoan vehicleLoan;

    private int age;
    
    public User() {
    }

    public User(String userId, Long accountNumber, String firstName, String lastName, String emailId,
            int accountBalance, String userName, Wallet wallet, HomeLoan homeLoan, String branchName,
            VehicleLoan vehicleLoan, int age) {
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.accountBalance = accountBalance;
        this.userName = userName;
        this.wallet = wallet;
        this.homeLoan = homeLoan;
        this.branchName = branchName;
        this.vehicleLoan = vehicleLoan;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public HomeLoan getHomeLoan() {
        return homeLoan;
    }

    public void setHomeLoan(HomeLoan homeLoan) {
        this.homeLoan = homeLoan;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public VehicleLoan getVehicleLoan() {
        return vehicleLoan;
    }

    public void setVehicleLoan(VehicleLoan vehicleLoan) {
        this.vehicleLoan = vehicleLoan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [accountBalance=" + accountBalance + ", accountNumber=" + accountNumber + ", age=" + age
                + ", branchName=" + branchName + ", emailId=" + emailId + ", firstName=" + firstName + ", homeLoan="
                + homeLoan + ", lastName=" + lastName + ", userId=" + userId + ", userName=" + userName
                + ", vehicleLoan=" + vehicleLoan + ", wallet=" + wallet + "]";
    }
  
}
