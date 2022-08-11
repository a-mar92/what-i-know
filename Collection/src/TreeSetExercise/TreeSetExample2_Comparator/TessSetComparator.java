package TreeSetExercise.TreeSetExample2_Comparator;

import javax.xml.namespace.QName;
import java.util.Comparator;
import java.util.TreeSet;

class AnimalElements {
    private String name;

    public AnimalElements(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnimalElements{" +
                "name='" + name + '\'' +
                '}';
    }
}

class AnimlaElementsCompar implements Comparator<AnimalElements> {
    @Override
    public int compare(AnimalElements o1, AnimalElements o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class TessSetComparator {
    public static void main(String[] args) {
        TreeSet<AnimalElements> animals = new TreeSet<>(new AnimlaElementsCompar());
        animals.add(new AnimalElements("Małpa"));
        animals.add(new AnimalElements("Dog"));
        animals.add(new AnimalElements("Żółw"));
        animals.add(new AnimalElements("Dog"));

        for (AnimalElements animal : animals
        ) {
            System.out.println(animal);

        }
    }
}
