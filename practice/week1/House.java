public class House {
    public void repaint(String newColor) {
        System.out.println("The house's color is now " + newColor);
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }
    
    public double calculateArea(double length, double width) {
        return length * width;
    }
}