package bank.example.demo.service;


 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import bank.example.demo.entity.User;
import bank.example.demo.repository.UserRepository;
 
@Service
public class UserService {
 
    @Autowired
    private UserRepository userRepository;
 
    public User createUser(User user){
        int n=(int)((Math.random() * 900) + 100);
        String userName=user.getFirstName().toLowerCase().charAt(0)+user.getLastName().toLowerCase()+String.valueOf(n);
        user.setUserName(userName);
 
        user.setAccountNumber((long)(Math.random() * 90000000) + 10000000);
 
        return(this.userRepository.save(user));
    }
 
}