import java.util.Arrays;

public class ArraySortowanie {
    public static void main(String[] args) {
    int array1[] = {4,3,1,2,100};
        int min;
        for (int i = 0; i < array1.length; i++) {
            min = array1[i];
            for (int j = i+ 1; j < array1.length; j++) {
                if (array1[j] < min){
                    min = array1[j] ;
                    array1[j] = array1[i];
                    array1[i] = min;
                }

            }

        }
        System.out.println(Arrays.toString(array1));





}}
