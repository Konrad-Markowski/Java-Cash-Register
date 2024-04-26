package TestClasses;

import classes.Item;

public class TestItem {
    public static void main(String[] args) {
        Item i1 = new Item("kij",25,"sport");
        Item i2 = new Item("piłka",50,"sport");
        Item i3 = new Item("klawiatura",250,"akcesoria komputerowe");

        System.out.println(i1.getPrice());
        System.out.println(i1.getName());

        i2.setPrice(34);
        System.out.println(i2.getPrice());
        System.out.println(i2);

    }
}
