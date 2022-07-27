package acces.example;

public class Start {
    public static void main(String[] args) {
        Car car = new Car("test");
        Car car1 = new Car();
        car.nameinfo();
        Product product = new Product();
        product.nameinfo();
        car1.nameinfo();
    }
}
