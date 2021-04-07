package bank.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bank.example.demo.entity.VehicleLoan;

public interface VehicleLoanRepository extends JpaRepository<VehicleLoan,String> {
    
}
