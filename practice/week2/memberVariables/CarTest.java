public class CarTest {
    public static void main(String[] args) {
        Car client1Car = new Car();
        client1Car.year = 2001;
        client1Car.make = "Honda";
        client1Car.model = "Civic";
        client1Car.color = "white";

        Car client2Car = new Car();
        client2Car.year = 2016;
        client2Car.make = "Toyota";
        client2Car.model = "Camry";
        client2Car.color = "silver";

        System.out.println("Car 1 make: " + client1Car.make);
        System.out.println("Car 1 model: " + client1Car.model);

        System.out.println("Car 2 make: " + client2Car.make);
        System.out.println("Car 2 model: " + client2Car.model);
    }
}