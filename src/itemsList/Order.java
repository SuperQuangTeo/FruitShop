package itemsList;

import java.util.Set;

public class Order {
    private String fruitID;
    private String fruitName;
    private int price;
    private int quantity;

    public Order(){
    }

    public Order(String fruitID, String fruitName, int price, int quantity){
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setFruitID(String fruitID) {
        this.fruitID = fruitID;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFruitID() {
        return fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
