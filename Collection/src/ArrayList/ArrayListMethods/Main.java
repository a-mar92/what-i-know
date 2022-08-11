package ArrayList.ArrayListMethods;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Adam");
        Person p2 = new Person("Kasia");
        Person p3 = new Person("Kamila");
        Person p4 = new Person("Tomasz");
        Person p5 = new Person("Erik");

        ArrayList<Person> arr1 = new ArrayList<>();
        arr1.add(p1);
        arr1.add(p2);
        arr1.add(p3);
        arr1.add(p4);
        arr1.add(p5);

        for (Person person : arr1
        ) {
            System.out.println(person);

        }

        Person p6 = new Person("Kuba");
        Person p7 = new Person("Zocha");


        ArrayList<Person> arr2 = new ArrayList<>();
        arr2.add(p6);
        arr2.add(p7);

        arr1.addAll(arr2);
        System.out.println();

        for (Person person : arr1
        ) {
            System.out.println(person);

        }


    }

}
