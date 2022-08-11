package IteratorMethods;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {
    public static void main(String[] args) {

        ArrayList<String> car = new ArrayList<>();
        car.add("Doge");
        car.add("Fiat");
        car.add("Ford");

        car.iterator().forEachRemaining(elements -> System.out.println(elements));

        Iterator<String> iterator = car.iterator();
        while (iterator.hasNext()) {
            String str;
            str = iterator.next();

            if (str.equalsIgnoreCase("fo")) {

                iterator.remove();
            }

        }
        car.iterator().forEachRemaining(elements -> System.out.println(elements));


    }
}
