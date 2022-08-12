package GenericType.ChallangeSquare;

public class Main {
    public static void main(String[] args) {
        Square<Integer> integerSquare = new Square<>(10);
        integerSquare.setWall(10);
        System.out.println(integerSquare.getSurfaceArea());

        Square<Float> floatSquare = new Square<>(5.7f);
        System.out.println(floatSquare.getSurfaceArea());
    }
}
