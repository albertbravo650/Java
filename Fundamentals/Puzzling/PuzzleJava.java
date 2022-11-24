import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random random = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        
        for(int i=1; i<=10; i++) {
            list1.add(random.nextInt(20) + 1);
        }
        return list1;
    }

    public char getRandomLetter() {
        ArrayList<Character> list2 = new ArrayList<Character>();
        // for(int i=0; i<26; i++) {
        //     list2.add('A');
        // }
        list2.add('a');
        list2.add('b');
        list2.add('c');
        list2.add('d');
        list2.add('e');
        list2.add('f');
        list2.add('g');
        list2.add('h');
        list2.add('i');
        list2.add('j');
        list2.add('k');
        list2.add('l');
        list2.add('m');
        list2.add('n');
        list2.add('o');
        list2.add('p');
        list2.add('q');
        list2.add('r');
        list2.add('s');
        list2.add('t');
        list2.add('u');
        list2.add('v');
        list2.add('w');
        list2.add('x');
        list2.add('y');
        list2.add('z');
        // System.out.println(list2);

        char letter = list2.get(random.nextInt(26));
        return letter;
    }

    public String generatePassword() {
        String randomString = "";
        for(int i=0; i<8; i++) {
            randomString = randomString + getRandomLetter();
        }
        return randomString;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i=0; i<length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}