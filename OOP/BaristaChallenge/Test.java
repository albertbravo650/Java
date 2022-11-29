public class Test {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("mocha", 4.25);

        Item item2 = new Item("latte", 4.05);

        Item item3 = new Item("drip coffee", 3.50);

        Item item4 = new Item("capuccino", 4.75);

        // Orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Cindy");
        Order order4 = new Order("Brad");
        Order order5 = new Order("Lana");
        // System.out.println(order2.getName());

        // Test
        order1.addItem(item2);
        order1.addItem(item3);
        order1.display();
        System.out.println(order1.getStatusMessage());
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());

    }
}