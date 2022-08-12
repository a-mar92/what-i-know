package GenericType.MethodsInClass.Exercise2;

import java.util.ArrayList;

public class GenericMethods {
    public static void main(String[] args) {

        ArrayList<String> person = new ArrayList<>();
        person.add("Patryk");
        person.add("Kuba");
        person.add("Wojtk");
        person.add("Kuba");


        System.out.println(Util.getLastElement(person));
    }
}
