package classes;

import interfaces.IPayment;

public class CardPayment implements IPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing card payment: "+amount);
    }
}
