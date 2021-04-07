package bank.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="vehicleloan")
public class VehicleLoan {
    @Id
    @GenericGenerator(name="txn_generator",strategy="bank.example.demo.generators.VehicleLoanIdGenerator")
    @GeneratedValue(generator = "txn_generator")
    @Column(length = 64)
    private String vehicleLoanId;
    private String vehicleType;
    @Column(unique = true,length = 64)
    private String vehicleNumber;
    private Long vehicleLoanAmount;
    private int vehicleLoanPeriod;
    private int vehicleLoanEMIPaid;
    private int emiToBePaid;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;
    public VehicleLoan() {
    }

    

    public String getVehicleLoanId() {
        return vehicleLoanId;
    }

    public void setVehicleLoanId(String vehicleLoanId) {
        this.vehicleLoanId = vehicleLoanId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Long getVehicleLoanAmount() {
        return vehicleLoanAmount;
    }

    public void setVehicleLoanAmount(Long vehicleLoanAmount) {
        this.vehicleLoanAmount = vehicleLoanAmount;
    }

    public int getVehicleLoanPeriod() {
        return vehicleLoanPeriod;
    }

    public void setVehicleLoanPeriod(int vehicleLoanPeriod) {
        this.vehicleLoanPeriod = vehicleLoanPeriod;
    }

    public int getVehicleLoanEMIPaid() {
        return vehicleLoanEMIPaid;
    }

    public void setVehicleLoanEMIPaid(int vehicleLoanEMIPaid) {
        this.vehicleLoanEMIPaid = vehicleLoanEMIPaid;
    }



    public int getEmiToBePaid() {
        return emiToBePaid;
    }



    public void setEmiToBePaid(int emiToBePaid) {
        this.emiToBePaid = emiToBePaid;
    }



    public User getUser() {
        return user;
    }



    public void setUser(User user) {
        this.user = user;
    }

    

    // @Override
    // public String toString() {
    //     return "VehicleLoan [user=" + user + ", vehicleLoanAmount=" + vehicleLoanAmount + ", vehicleLoanEMIPaid="
    //             + vehicleLoanEMIPaid + ", vehicleLoanId=" + vehicleLoanId + ", vehicleLoanPeriod=" + vehicleLoanPeriod
    //             + ", vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + "]";
    // }

    
}
