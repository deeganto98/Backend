package bank.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bank.example.demo.entity.HomeLoan;

@Repository
public interface HomeLoanRepository extends JpaRepository<HomeLoan,String>{
    
    

}
