package TreeSetExercise.TreeSetExample2;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (int i = 1; i <= 50; i++) {
            int number = random.nextInt(101);
            integerTreeSet.add(number);
            System.out.println("iteracja " + i + " : " + number);

        }
        Iterator<Integer> interator = integerTreeSet.iterator();
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
    }
}
