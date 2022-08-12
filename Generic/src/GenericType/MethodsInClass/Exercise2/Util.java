package GenericType.MethodsInClass.Exercise2;

import java.util.ArrayList;

public class Util {

    public static <T> T getLastElement(ArrayList<T> list){
        return list.get(list.size()-1);
        }
    }

