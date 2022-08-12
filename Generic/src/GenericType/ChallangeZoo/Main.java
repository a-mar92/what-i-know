package GenericType.ChallangeZoo;

public class Main {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Tiger("loki",19));
        zoo.addAnimal(new Lion("Król Lew",50));
        zoo.printAnimalInZoo();
    }
}
