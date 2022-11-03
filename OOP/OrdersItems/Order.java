import java.util.ArrayList;


public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();

    public double getTotal() {
        for(Item item : items) {
            total += item.price;
        }
        total = Math.round(total * 100);
        total = total/100;
        return total;
    }
}