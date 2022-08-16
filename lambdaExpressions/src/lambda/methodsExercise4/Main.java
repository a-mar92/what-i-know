package lambda.methodsExercise4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String tab[] = {"Ford", "Opel","Fiat","Mercedes","Volvo","BMW","Audi","Skoda"};

        Arrays.sort(tab,(a,b) -> {


            return (a.length()- b.length());
        } );

    //    for (String name : tab ){
    //        System.out.println(name);
    //    }

        System.out.println(Arrays.toString(tab));
            }
            }


