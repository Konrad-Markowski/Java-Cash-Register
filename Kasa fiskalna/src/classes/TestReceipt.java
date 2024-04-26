package classes;

import java.util.ArrayList;
import java.util.List;

public class TestReceipt {
    public static void main(String[] args) {
        List<Item>items=new ArrayList<>();
        Item i1 = new Item("dildo",137.05,"erotyczne");
        Item i2 = new Item("kutas smoka",1000,"erotyczne");
        Item i3 = new Item("rura",1000,"rozrywka");

        items.add(i1);
        items.add(i2);
        items.add(i3);

        Receipt r1=new Receipt(items,2137.05);
        r1.printReceipt();

    }
}
