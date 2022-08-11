package TreeSetExercise.TreeSetExample1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {

        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        treeSetInteger.add(80);
        treeSetInteger.add(1000);
        treeSetInteger.add(90);
        treeSetInteger.add(58);
        treeSetInteger.add(80);
        treeSetInteger.add(8);

        Iterator<Integer> integerIterator = treeSetInteger.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }


        Iterator<Integer> integerIterator1 = treeSetInteger.descendingIterator();
        while (integerIterator1.hasNext()) {
            System.out.println(integerIterator1.next());
        }
    }
}
