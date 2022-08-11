package ArrayList.ArrayListIteraction;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Fiat", 1992, "125p"));
        cars.add(new Car("Ford", 2015, "Mondeo"));
        cars.add(new Car("Skoda", 2015, "Fabia"));
        cars.add(new Car("JEEP", 2000, "chrokiee"));

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }

    }
}
