package LinkedList.LinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Staś");
        list.addLast("Dawid");
        System.out.println(list);

        //System.out.println( list.contains(p1));
        list.remove(2);
        //System.out.println( list.contains(p1));
        list.set(2, "ALA");
        list.add(2, "Tomek");
        System.out.println(list.size());

        Iterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            String name = iterator1.next();
            System.out.println(name);
        }
        ListIterator<String> iterator2 = list.listIterator(list.size());
        while (iterator2.hasPrevious()) {
            String name = iterator2.previous();
            System.out.println(name);
        }


    }
}
