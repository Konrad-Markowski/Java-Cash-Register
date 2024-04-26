package classes;

import interfaces.IPayment;

public class CashPayment implements IPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment: "+amount);
    }
}
