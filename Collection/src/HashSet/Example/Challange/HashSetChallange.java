package HashSet.Example.Challange;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetChallange {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        names.add("Ola");
        names.add("Kasia");
        names.add("Adam");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        HashSet<Car> cars = new HashSet<>();
        Car doge = new Car("Doge");
        cars.add(doge);
        cars.add(doge);
        Car citroen = new Car("Citroen");
        cars.add(citroen);
        cars.add(citroen);
        Car opel = new Car("Opel");
        cars.add(opel);
        cars.add(opel);
        cars.add(new Car("Opel"));

        Iterator<Car> iterator1 = cars.iterator();
        while (iterator1.hasNext()) {
            Car namecar = iterator1.next();
            System.out.println(namecar);
        }
    }
}
