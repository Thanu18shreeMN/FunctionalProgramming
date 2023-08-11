package binary;
import java.util.function.*;

class Item { 
    private String name;
    private double price;
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}

public class Binarynew { 
    public static void main(String[] args) {
        Item item1 = new Item("Item 1", 15.99);
        Item item2 = new Item("Item 2", 25.99);
        
        BinaryOperator<Item> maxPriceItem = BinaryOperator.maxBy(
            (itemA, itemB) -> Double.compare(itemA.getPrice(), itemB.getPrice())
        );
        
        Item itemWithMaxPrice = maxPriceItem.apply(item1, item2);
        System.out.println("Item with maximum price: " + itemWithMaxPrice.getName());
    }
}
