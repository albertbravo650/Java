public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("person1", 25);
        Person person2 = new Person("person1", 25);
        Person person3 = new Person("person1", 25);
        Person person4 = new Person("person1", 25);
        Person person5 = new Person("person1", 25);
        Person person6 = new Person("person1", 25);

        System.out.println(person1.peopleCount());
    }
}