package lambda.AllayList;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("Audi");
        names.add("Skoda");
        names.add("Doge");
        names.add("BMW");
        names.add(null);
        names.add("Citroen");
        names.removeIf(a -> a==null || a.equalsIgnoreCase("bmw"));
        names.sort( (o1, o2) -> o1.length() - o2.length()  );


        System.out.println(names);
        }
    }

