public class Car {
    public int gas;

    public Car() {
        this.gas = 10;
    }

    public void statusMessage() {
        System.out.println("Gas: " + gas + "/10");
    }

    // getter and setter
    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}