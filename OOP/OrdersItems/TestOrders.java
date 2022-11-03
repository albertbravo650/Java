import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4.25;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.05;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 3.50;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 4.75;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";
    
        // Application Simulations
        order2.items.add(item1);
        order2.getTotal();
        order3.items.add(item4);
        order3.getTotal();
        order4.items.add(item2);
        order4.items.add(item2);
        order4.items.add(item2);
        order4.getTotal();
        order1.ready = true;
        order2.ready = true;

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Items: %s\n", order1.items);
        System.out.println("------------------------");

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Items: %s\n", order2.items);
        System.out.println("------------------------");

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Items: %s\n", order3.items);
        System.out.println("------------------------");

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        System.out.printf("Items: %s\n", order4.items);
        System.out.println("------------------------");
    }
}
