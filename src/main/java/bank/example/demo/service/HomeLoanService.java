package bank.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import bank.example.demo.entity.HomeLoan;
import bank.example.demo.entity.User;
import bank.example.demo.repository.HomeLoanRepository;
import bank.example.demo.repository.UserRepository;

@Service
public class HomeLoanService {
    
    @Autowired
    HomeLoanRepository repository1;

    @Autowired
    UserRepository repository2;

    HomeLoan homeLoan=new HomeLoan();
    User user=new User();

    public int createHomeLoan(HomeLoan homeloan,
                            Long accountNumber){
        user = this.repository2.findByAccountNumber(accountNumber);   
        if(user.getHomeLoan()==null){
            homeLoan.setUser(user);
            homeLoan.setPropertyType(homeloan.getPropertyType());
            homeLoan.setPropertyAddress(homeloan.getPropertyAddress());
            homeLoan.setHomeLoanAmount(homeloan.getHomeLoanAmount());
            homeLoan.setHomeLoanPeriod(homeloan.getHomeLoanPeriod());
            // Integer amount=Integer.parseInt(homeloan.getHomeLoanAmount());
            Long amount=homeLoan.getHomeLoanAmount();
            Long emiToBePaid=(amount)/(12*homeloan.getHomeLoanPeriod());
            int emi=emiToBePaid.intValue();
            homeLoan.setEmiToBePaid(emi);
            user.setHomeLoan(homeLoan);
            repository1.save(homeLoan);
            return homeLoan.getEmiToBePaid();
        }
        else{
            return homeLoan.getEmiToBePaid();
        }
    }

}
