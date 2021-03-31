package bank.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VehicleLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String vehicleLoanId;

    private String vehicleType;
    private String vehicleNumber;
    private Long vehicleLoanAmount;
    private int vehicleLoanPeriod;
    private int vehicleLoanEMIPaid;

    @OneToOne(mappedBy = "vehicleLoan")
    private User user;

    public VehicleLoan() {
    }

    public VehicleLoan(String vehicleLoanId, String vehicleType, String vehicleNumber, Long vehicleLoanAmount,
            int vehicleLoanPeriod, int vehicleLoanEMIPaid, User user) {
        this.vehicleLoanId = vehicleLoanId;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.vehicleLoanAmount = vehicleLoanAmount;
        this.vehicleLoanPeriod = vehicleLoanPeriod;
        this.vehicleLoanEMIPaid = vehicleLoanEMIPaid;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "VehicleLoan [user=" + user + ", vehicleLoanAmount=" + vehicleLoanAmount + ", vehicleLoanEMIPaid="
                + vehicleLoanEMIPaid + ", vehicleLoanId=" + vehicleLoanId + ", vehicleLoanPeriod=" + vehicleLoanPeriod
                + ", vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + "]";
    }

    
}
