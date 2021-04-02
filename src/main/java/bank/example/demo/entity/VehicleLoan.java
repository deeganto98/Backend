package bank.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="vehicleloan")
public class VehicleLoan {
    @Id
<<<<<<< HEAD
    @GenericGenerator(name="txn_generator",strategy="bank.example.demo.generators.VehicleLoanIdGenerator")
    @GeneratedValue(generator = "txn_generator")
    @Column(length = 64)
    private String vehicleLoanId;
=======
    // @GenericGenerator(name="vhc_generator",strategy="bank.example.demo.functionalities.VehicleLoanIdGenerator")
    // @GeneratedValue(generator = "vhc_generator")
    private int vehicleLoanId;

>>>>>>> 66fa61612daac949a2ad97ed73ec861b3ccd304a
    private String vehicleType;
    @Column(unique = true)
    private String vehicleNumber;
    private Long vehicleLoanAmount;
    private int vehicleLoanPeriod;
    private int vehicleLoanEMIPaid;
<<<<<<< HEAD
    @OneToOne(mappedBy = "vehicleLoan")
    private User user;
=======

    // @OneToOne(mappedBy = "vehicleLoan")
    // private User user;
>>>>>>> 66fa61612daac949a2ad97ed73ec861b3ccd304a

    public VehicleLoan() {
    }

<<<<<<< HEAD
    public VehicleLoan(String vehicleLoanId, String vehicleType, String vehicleNumber, Long vehicleLoanAmount,
        int vehicleLoanPeriod, int vehicleLoanEMIPaid, User user) {
=======
    public VehicleLoan(int vehicleLoanId, String vehicleType, String vehicleNumber, Long vehicleLoanAmount,
            int vehicleLoanPeriod, int vehicleLoanEMIPaid, User user) {
>>>>>>> 66fa61612daac949a2ad97ed73ec861b3ccd304a
        this.vehicleLoanId = vehicleLoanId;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.vehicleLoanAmount = vehicleLoanAmount;
        this.vehicleLoanPeriod = vehicleLoanPeriod;
        this.vehicleLoanEMIPaid = vehicleLoanEMIPaid;
        // this.user = user;
    }

    public int getVehicleLoanId() {
        return vehicleLoanId;
    }

    public void setVehicleLoanId(int vehicleLoanId) {
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

    // public User getUser() {
    //     return user;
    // }

    // public void setUser(User user) {
    //     this.user = user;
    // }

    // @Override
    // public String toString() {
    //     return "VehicleLoan [user=" + user + ", vehicleLoanAmount=" + vehicleLoanAmount + ", vehicleLoanEMIPaid="
    //             + vehicleLoanEMIPaid + ", vehicleLoanId=" + vehicleLoanId + ", vehicleLoanPeriod=" + vehicleLoanPeriod
    //             + ", vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + "]";
    // }

    
}
