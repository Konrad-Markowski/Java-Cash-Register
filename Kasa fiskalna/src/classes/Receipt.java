package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Receipt {
    private List<Item> items;
    private double totalPrice;
    private LocalDateTime date;

    public Receipt(List<Item> items) {
        this.items = items;
        this.date = LocalDateTime.now();
    }

    public List<Item> getItems() {
        return items;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getTotalPrice(){
        double sum=0;
        for(Item item : items){
            sum+=item.getPrice();
        }
        totalPrice=sum;
        return totalPrice;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void printReceipt(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = date.format(formatter);
        for (Item item : items){
            System.out.println(item);
        }
        System.out.println("total price: "+getTotalPrice()+"PLN"+"\n"+"date: "+formattedDate);
    }
}
