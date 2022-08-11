package HashMapExercise.HashMapExercise2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapxercise2 {
    public static void main(String[] args) {
        HashMap<String, Animal> animalHashMap = new HashMap<>();
        String nameAnimal[] = {"Pies", "Kot", "Koza", "Puma"};
        for (int i = 0; i < nameAnimal.length; i++) {
            String name = nameAnimal[i];
            animalHashMap.put(name, new Animal(name));

        }
        Animal animalPuma = animalHashMap.get("Puma");
        System.out.println(animalPuma);

        for (Map.Entry<String, Animal> entry : animalHashMap.entrySet()
        ) {
            String animlaKey = entry.getKey();
            Animal animlaName = entry.getValue();
            System.out.println(animlaKey + " : " + animlaName);

        }

    }

}


