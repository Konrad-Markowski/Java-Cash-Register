package classes;

import interfaces.IPayment;
import interfaces.ITransaction;

import java.util.List;

public class Transaction implements ITransaction {
    private Receipt receipt;
    private IPayment paymentMethod;
    private List<Item>itemList;

    public Transaction(Receipt receipt, IPayment paymentMethod, List<Item> itemList) {
        this.receipt = receipt;
        this.paymentMethod = paymentMethod;
        this.itemList = itemList;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public IPayment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public void startTransaction() {
        System.out.println("Starting transaction.");
    }

    @Override
    public void addItem(Item item) {
        itemList.add(item);
        System.out.println("Item added: "+item.getName());
    }

    @Override
    public void finalizeTransaction() {
        System.out.println("Transaction finalized.");
    }

}
