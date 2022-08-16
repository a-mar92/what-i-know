package lambda.BasicExercise3;



public class Addition {
    public void test(AdditionInteface dowlna_nazwa){
        System.out.println(dowlna_nazwa.add(100,50));
    }

    public static void main(String[] args) {

        AdditionInteface addition=  (int a, int b) -> a+b;

        int result = addition.add(6,7);
        System.out.println(result);

        Addition addition1 = new Addition();
        addition1.test((a,b) -> 2*a + b);

        MathOperation <Integer> mathOperation = (  a,  b) -> {
            int multiplication  = a * b;
            return multiplication;

        };
        int resultMultipication = mathOperation.mathOperation(5,5);
        System.out.println(resultMultipication);

        MathOperation <Float> addOperation = (a,b) -> a+b;
        System.out.println(addOperation.mathOperation(5.55f,1.5421f));
    }
}
