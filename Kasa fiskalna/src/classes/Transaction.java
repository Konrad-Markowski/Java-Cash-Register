package classes;

import interfaces.IPayment;
import interfaces.ITransaction;

import java.util.Scanner;

public class Transaction implements ITransaction {
    private Receipt receipt;
    private String paymentMethod;

    public Transaction(Receipt receipt, String paymentMethod) {
        this.receipt = receipt;
        this.paymentMethod = paymentMethod;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void startTransaction() {
        System.out.println("Starting transaction.");
    }

    @Override
    public void finalizeTransaction() {
        System.out.println("Transaction finalized.");
    }

    public void printTransaction(){
        System.out.println(getClass().getSimpleName()+":");
        getReceipt().printReceipt();
        System.out.println("Payment method: "+getPaymentMethod());
    }


}
