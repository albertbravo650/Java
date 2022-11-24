import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello " + 25);
        PuzzleJava generator = new PuzzleJava();

        // ArrayList<Integer> randomRolls = generator.getTenRolls();
        // System.out.println(randomRolls);

        // char randLetter = generator.getRandomLetter();
        // System.out.println(randLetter);

        // String password = generator.generatePassword();
        // System.out.println(password);

        ArrayList<String> newPasswordSet = generator.getNewPasswordSet(10);
        System.out.println(newPasswordSet);

    }
}