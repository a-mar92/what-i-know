package lambda.basicExercise1;

public class Main {
    public static void main(String[] args) {
        Add add = (int a, int b )-> a+b;
        int result = add.addInteface(5,6);
        System.out.println(result);

    }
}
