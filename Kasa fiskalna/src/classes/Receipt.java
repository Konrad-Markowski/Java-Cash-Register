package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Receipt {
    private List<Item> items;
    private double totalPrice;
    private LocalDateTime date;

    public Receipt(List<Item> items, double totalPrice) {
        this.items = items;
        this.totalPrice = totalPrice;
        this.date = LocalDateTime.now();
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void printReceipt(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = date.format(formatter);
        for (Item item : items){
            System.out.println(item);
        }
        System.out.println("total price: "+totalPrice+"PLN"+"\n"+"date: "+formattedDate);
    }
}
