package TestClasses;

import classes.Item;
import classes.Receipt;

import java.util.ArrayList;
import java.util.List;

public class TestReceipt {
    public static void main(String[] args) {
        List<Item>items=new ArrayList<>();
        Receipt r1 = new Receipt(items);
        Item i1 = new Item("kij",25,"sport");
        Item i2 = new Item("piłka",50,"sport");
        Item i3 = new Item("klawiatura",250,"akcesoria komputerowe");
        r1.addItem(i1);
        r1.addItem(i2);
        r1.addItem(i3);
        r1.printReceipt();


    }
}
