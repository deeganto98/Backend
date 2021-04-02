package bank.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class HomeLoan {
    
    @Id
    @GenericGenerator(name="txn_generator",strategy="bank.example.demo.generators.HomeLoanIdGenerator")
    @GeneratedValue(generator = "txn_generator")
    @Column(length = 64)
    private String homeLoanId;

    private String propertyType;
    private String propertyAddress;
    private String homeLoanAmount;
    private int homeLoanPeriod;
    private int homeLoanEmiPaid;

    @OneToOne(mappedBy = "homeLoan")
    private User user;

    public HomeLoan() {
    }

    public HomeLoan(String homeLoanId, String propertyType, String propertyAddress, String homeLoanAmount,
            int homeLoanPeriod, int homeLoanEmiPaid, User user) {
        this.homeLoanId = homeLoanId;
        this.propertyType = propertyType;
        this.propertyAddress = propertyAddress;
        this.homeLoanAmount = homeLoanAmount;
        this.homeLoanPeriod = homeLoanPeriod;
        this.homeLoanEmiPaid = homeLoanEmiPaid;
        this.user = user;
    }

    public String getHomeLoanId() {
        return homeLoanId;
    }

    public void setHomeLoanId(String homeLoanId) {
        this.homeLoanId = homeLoanId;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getHomeLoanAmount() {
        return homeLoanAmount;
    }

    public void setHomeLoanAmount(String homeLoanAmount) {
        this.homeLoanAmount = homeLoanAmount;
    }

    public int getHomeLoanPeriod() {
        return homeLoanPeriod;
    }

    public void setHomeLoanPeriod(int homeLoanPeriod) {
        this.homeLoanPeriod = homeLoanPeriod;
    }

    public int getHomeLoanEmiPaid() {
        return homeLoanEmiPaid;
    }

    public void setHomeLoanEmiPaid(int homeLoanEmiPaid) {
        this.homeLoanEmiPaid = homeLoanEmiPaid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "HomeLoan [homeLoanAmount=" + homeLoanAmount + ", homeLoanEmiPaid=" + homeLoanEmiPaid + ", homeLoanId="
                + homeLoanId + ", homeLoanPeriod=" + homeLoanPeriod + ", propertyAddress=" + propertyAddress
                + ", propertyType=" + propertyType + ", user=" + user + "]";
    }

    
}
