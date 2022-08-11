package HashSet.Example.Example1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<Animal> animals = new HashSet<>();
        Animal panda = new Animal("Panda");
        animals.add(panda);
        animals.add(new Animal("Małpa"));
        animals.add(panda);
        animals.add(new Animal("Koala"));
        animals.add(new Animal("Panda"));
        System.out.println(animals);

        for (Animal animal : animals
        ) {
            System.out.println(animal);

        }
        System.out.println();
        Iterator<Animal> interator = animals.iterator();
        while (interator.hasNext()) {
            Animal animal = interator.next();
            System.out.println(animal);
        }
    }
}
