package itemsList;

public class Fruits {
    private String fruitID;
    private String fruitName;
    private int price;
    private int quantity;
    private String origin; 

    public Fruits(){
    }

    public Fruits(String fruitID, String fruitName, int price, int quantity, String origin){
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public String getFruitID() {
        return fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFruitID(String fruitID) {
        this.fruitID = fruitID;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}