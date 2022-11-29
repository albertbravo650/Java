public class Driver extends Car {
    private String name;

    public Driver() {
    }

    public Driver(String name) {
        this.name = name;
    }

    public void drive() {
        if(gas == 0) {
            System.out.println("game over");
        } else {
            gas -= 1;
            System.out.println("You drive the car.");
            System.out.println("Gas remaining: " + gas + "/10");
        }
    }

    public void useBoosters() {
        if(gas == 0) {
            System.out.println("game over");
        } else {
            if(gas < 3) {
                System.out.println("Car needs more gas!");
            } else {
                gas -= 3;
                System.out.println("You used boosters!");
                System.out.println("Gas remaining: " + gas + "/10");
            }
        }
    }

    public void refuel() {
        if(gas > 8) {
            System.out.println("Not time to refuel.. keep driving.");
        } else {
            gas += 2;
            System.out.println("You are refueling.");
            System.out.println("Gas remaining: " + gas + "/10");
        }
    }
}