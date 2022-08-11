package HashMapExercise.HashMapExercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExercise1 {

    public static void main(String[] args) {

        HashMap<String, Car> carHashMap = new HashMap<>();
        carHashMap.put("Ford", new Car("Mondeo MK V"));
        carHashMap.put("Volvo", new Car("V50 2010"));
        carHashMap.put("Skoda", new Car("Fabia 2013 1.0"));

        Car carVolvo = carHashMap.get("Volvo");
        System.out.println(carVolvo);

        Iterator iterator = carHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            Car car = (Car) entry.getValue();
            System.out.println(key + " : " + car);
        }
        System.out.println();

        for (Map.Entry<String, Car> entry : carHashMap.entrySet()
        ) {
            String key = entry.getKey();
            Car carValue = entry.getValue();
            System.out.println(key + " : " + carValue);

        }
    }
}
