package bank.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bank.example.demo.entity.Wallet;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, String> {

    @Query("select walletBalance from Wallet where walletOwnerEmail=?1")
    public int findMoneyByemail();

    public List<Wallet> findBywalletId(String id);
}