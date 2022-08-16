package lambda.dele;

import lambda.BasicExercise3.MathOperation;
import lambda.Main;


public class MatmaLambda {



    public static void main(String[] args) {
        Dodawanie dodawanie = (int a, int b) -> a + b;
        int result = dodawanie.add(5, 6);
        System.out.println(result);

        MathOperation<Integer> multiPlication = (Integer a, Integer b) -> a * b;
        int wynik = multiPlication.mathOperation(5, 5);
        System.out.println(wynik);

        Metoda  matmaLambda = new Metoda();

        matmaLambda.nazwa((a, b) -> a / b);

    }
}
