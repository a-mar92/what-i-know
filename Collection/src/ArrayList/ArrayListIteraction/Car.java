package ArrayList.ArrayListIteraction;

public class Car {
    private String name;
    private int year;
    private String manufactures;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", manufactures='" + manufactures + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }

    public Car(String name, int year, String manufactures) {
        this.name = name;
        this.year = year;
        this.manufactures = manufactures;
    }
}
