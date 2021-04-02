package bank.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Transactions {
    
    @Id
    @GenericGenerator(name="txn_generator",strategy="bank.example.demo.generators.TransactionIdGenerator")
    @GeneratedValue(generator = "txn_generator")
    @Column(length = 64)
    private String transactionId;
    private String transactionType;
    private String transactionBy;
    private String transactionByEmail;
    private int transactionAmount;
    private String transactionRemarks;
    
    public Transactions() {
    }

    public Transactions(String transactionId, String transactionType, String transactionBy, String transactionByEmail,
            int transactionAmount, String transactionRemarks) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionBy = transactionBy;
        this.transactionByEmail = transactionByEmail;
        this.transactionAmount = transactionAmount;
        this.transactionRemarks = transactionRemarks;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionBy() {
        return transactionBy;
    }

    public void setTransactionBy(String transactionBy) {
        this.transactionBy = transactionBy;
    }

    public String getTransactionByEmail() {
        return transactionByEmail;
    }

    public void setTransactionByEmail(String transactionByEmail) {
        this.transactionByEmail = transactionByEmail;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionRemarks() {
        return transactionRemarks;
    }

    public void setTransactionRemarks(String transactionRemarks) {
        this.transactionRemarks = transactionRemarks;
    }

    @Override
    public String toString() {
        return "Transactions [transactionAmount=" + transactionAmount + ", transactionBy=" + transactionBy
                + ", transactionByEmail=" + transactionByEmail + ", transactionId=" + transactionId
                + ", transactionRemarks=" + transactionRemarks + ", transactionType=" + transactionType + "]";
    }
    
}
