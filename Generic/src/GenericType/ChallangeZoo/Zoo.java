package GenericType.ChallangeZoo;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo <T extends Animal>{
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

public  void  addAnimal(T animal){
        this.animals.add(animal);
}

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void printAnimalInZoo(){
        for (Animal animla: animals
             ) {
            System.out.println(animla);
            
        }
        }
    }

