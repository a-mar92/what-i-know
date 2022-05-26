import java.util.Arrays;
import java.util.Random;

public class ArrayPrzesuniecie {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayFirs[] = new int[10]; // [|1|2|3|4|] 0 1 2 3
        int przesuniete[] = new int[10];//[|0|1|2|3|] 0 1 2 3


        for (int i = 0; i < arrayFirs.length; i++) {
            int value = random.nextInt(5);
            arrayFirs[i] = value;
        }
        for (int i = 0; i < arrayFirs.length; i++) {
            if (i == 0){
                przesuniete[0] = arrayFirs[arrayFirs.length-1];
            }else
                przesuniete [i] = arrayFirs[i-1];
        }

        System.out.println(Arrays.toString(arrayFirs));



        System.out.println(Arrays.toString(przesuniete));
    }
}
