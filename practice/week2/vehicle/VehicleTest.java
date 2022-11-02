class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();

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
    }
}