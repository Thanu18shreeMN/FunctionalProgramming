package binary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


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

public class Binary {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item 1", 10.0));
        items.add(new Item("Item 2", 15.0));
        items.add(new Item("Item 3", 5.0));

        Optional<Item> itemWithMaxPrice = items.stream()
                .max(Comparator.comparingDouble(Item::getPrice));

        if (itemWithMaxPrice.isPresent()) {
            Item maxItem = itemWithMaxPrice.get();
            System.out.println("Item with max price: " + maxItem.getName() + " - " + maxItem.getPrice());
        } else {
            System.out.println("No items in the list.");
        }
    }
}
