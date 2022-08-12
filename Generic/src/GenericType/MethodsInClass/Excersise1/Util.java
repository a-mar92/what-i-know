package GenericType.MethodsInClass.Excersise1;

import java.util.ArrayList;

public class Util {

    public static <T> void printList(ArrayList<T> list){
        for (int i = 0; i < list.size(); i++) {

            T elements = list.get(i);
            System.out.println(elements);

        }
    }

}
