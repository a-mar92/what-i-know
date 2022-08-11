package LinkedList.LinkedListExample2;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasic2 {
    public static void main(String[] args) {
        LinkedList<String> people = new LinkedList<>();
        people.add("Ola");
        String p2 = "Kasia";
        people.add("Rafał");
        people.addFirst(p2);
        people.add("Kuba");
        people.addLast("Adam");

        System.out.println(people);

        ListIterator<String> iterator = people.listIterator();

        while (iterator.hasNext()) {
            String person = iterator.next();
            if (person.equalsIgnoreCase("ola")) {
                iterator.set("Viki");
            }
            if (person.equalsIgnoreCase("Kuba")) {
                iterator.add("Błażej");
            }
            if (person.equalsIgnoreCase("Rafał")) {
                iterator.remove();
            }


        }
        for (String person : people
        ) {
            System.out.println(person);

        }
        System.out.println(people);
    }
}
