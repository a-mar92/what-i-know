package ArrayList.ArrayListBasic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        System.out.println(names.get(0));
        String test = names.get(0);
        System.out.println(test);
        names.set(1, "Olek");
        names.add(1, "Karlo");
        //names.remove(0);
        System.out.println();
        for (String name : names) {
            System.out.println(name);

        }
    }
}