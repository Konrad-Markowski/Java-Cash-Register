package classes;

public class Item {
    private String name;
    private double price;
    private String category;

    public Item(String name, double price, String category) {
        if(name.isEmpty()){
            this.name = "";
        }
        else this.name=name;

        if(price < 0){
            this.price=0;
        }
        else this.price=price;

        if(category.isEmpty()){
            this.category = "";
        }
        else this.category=category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            this.name = "";
        }
        else this.name=name;
    }

    public void setPrice(double price) {
        if(price < 0){
            this.price=0;
        }
        else this.price=price;
    }

    public void setCategory(String category) {
        if(category.isEmpty()){
            this.category = "";
        }
        else this.category=category;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", price: " + price +"PLN"+ ", category: " + category;
    }




}
