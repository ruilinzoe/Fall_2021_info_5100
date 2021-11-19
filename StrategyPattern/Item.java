package StrategyPattern;

public class Item extends ShoppingCart{
    private String Id;
    private int price;
    public Item(String id, int price){
        this.Id=id;
        this.price=price;
    }

    public String getId() {
        return Id;
    }

    public int getPrice() {
        return price;
    }
}
