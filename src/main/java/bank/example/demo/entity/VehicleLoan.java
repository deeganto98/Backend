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
    @OneToOne(mappedBy = vehicleLoan)
    private User user;

}
