package bank.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bank.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    @Query("from User where emailId=?1")
   public User findByemailId(String userEmail);

    @Query("from User where accountNumber=?1")
    public User findByAccountNumber(Long accountNumber);

}   