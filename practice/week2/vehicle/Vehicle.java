class Vehicle {
    private int numberOfWheels;
    private String color;

    //new vehicle
    public Vehicle() {
    }

    //Overloading
    //new vehicle with color
    public Vehicle(String color) {
        this.color = color;
    }

    //new vehicle with color and number of wheels
    public Vehicle(String color, int num) {
        this.color = color;
        this.numberOfWheels = num;
    }

    //getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    //setter
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }

    //getter
    public String getColor() {
        return color;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }
}