class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();
        Vehicle greenCar = new Vehicle("green");
        Vehicle truck = new Vehicle("black", 6);

        bike.setNumberOfWheels(2);
        bike.setColor("red");
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();

        car.setNumberOfWheels(4);
        car.setColor("white");
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();

        System.out.println("Bike: wheels - " + bikeWheels + ", color - " + bikeColor);
        System.out.println("Car: wheels - " + carWheels + ", color - " + carColor);
        System.out.println(greenCar.getColor());

        String greenCarColor = greenCar.getColor();

        System.out.println("The vehicle color is " + greenCarColor);
        System.out.println("The vehicle color is " + greenCar.getColor());

        System.out.println("The truck color is " + truck.getColor());
        System.out.println("The truck number of wheels is " + truck.getNumberOfWheels());
    }
}