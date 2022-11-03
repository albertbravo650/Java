public class Person {
    private String name;
    private int age;
    private static int numPeople = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numPeople++;
    }

    public static int peopleCount() {
        return numPeople;
    }
}