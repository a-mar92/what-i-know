package LinkedList.LinkedList.LinkedListChallange;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class LinkedListBasic3 {
    public static void main(String[] args) {

        LinkedList<Animal> animals = new LinkedList<>();
        String name[] = {"Lion", "Panda", "Tiger", "Dog", "Cat"};
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int losowaLiczba = random.nextInt(name.length);
            String aname = name[losowaLiczba];

            animals.add(new Animal(aname));
        }
        animals.removeFirst();
        animals.removeLast();

        animals.addLast(new Animal("New Lion"));
        animals.addFirst(new Animal("NEW Tiger"));

        ListIterator<Animal> itegaro = animals.listIterator();
        while (itegaro.hasNext()) {
            Animal animalName = itegaro.next();
            System.out.println(animalName);
        }

    }
}
