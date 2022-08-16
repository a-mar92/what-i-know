package lambda.basicExercise2;

public class Main {
    public static void main(String[] args) {
        SubstractionGeneric <Integer> substractionGeneric = (Integer a, Integer b) -> {
            int v = a-b;
            return v;
        };
        int result = substractionGeneric.substraction(10,15);
        System.out.println(result);

    }
}
