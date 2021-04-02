package bank.example.demo.generators;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class WalletIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor arg0, Object arg1) throws HibernateException {
        String prefix = "LOOT";
        int randomPIN = (int) (Math.random() * 90000000) + 10000000;
        String val = String.valueOf(randomPIN);
        String code = prefix + val;
        return code;
    }
}