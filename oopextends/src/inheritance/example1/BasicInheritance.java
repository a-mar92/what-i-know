package inheritance.example1;

public class BasicInheritance {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        //vehicle.printInfo();
        Car car = new Car("BMW",  100.10f);
        car.printInfo();
        Car car1 = new Car();
        car1.printInfo();
    }
}
