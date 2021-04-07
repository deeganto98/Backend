package bank.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.example.demo.entity.User;
import bank.example.demo.entity.VehicleLoan;
import bank.example.demo.repository.UserRepository;
import bank.example.demo.repository.VehicleLoanRepository;

@Service
public class VehicleLoanService {

    @Autowired
    private VehicleLoanRepository vehicleLoanRepository;

    @Autowired
    private UserRepository userRepository;

    VehicleLoan vehicleLoan=new VehicleLoan();
    User user=new User();

    public int createVehicleLoan(VehicleLoan vehicleLoan,
    Long accountNumber){
        user = this.userRepository.findByAccountNumber(accountNumber);   
        if(user.getHomeLoan()==null){
            vehicleLoan.setUser(user);
            vehicleLoan.setVehicleType(vehicleLoan.getVehicleType());
            vehicleLoan.setVehicleNumber(vehicleLoan.getVehicleNumber());
            vehicleLoan.setVehicleLoanAmount(vehicleLoan.getVehicleLoanAmount());
            vehicleLoan.setVehicleLoanPeriod(vehicleLoan.getVehicleLoanPeriod());
            // Integer amount=Integer.parseInt(homeloan.getHomeLoanAmount());
            Long amount=vehicleLoan.getVehicleLoanAmount();
            Long emiToBePaid=(amount)/(12*vehicleLoan.getVehicleLoanPeriod());
            int emi=emiToBePaid.intValue();
            vehicleLoan.setEmiToBePaid(emi);
            user.setVehicleLoan(vehicleLoan);
            vehicleLoanRepository.save(vehicleLoan);
            return vehicleLoan.getEmiToBePaid();
        }
        else{
            return vehicleLoan.getEmiToBePaid();
        }

    }
}
