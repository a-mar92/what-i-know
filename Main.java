import java.net.Proxy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue;
        double numberOfMonths;

        double procent;
        double finalValue;

        System.out.println("Deposit your Money :" );
        startValue = Integer.valueOf(scanner.nextInt());
        System.out.println("How long you give me money ? in month :");
        numberOfMonths = Integer.valueOf(scanner.nextInt());
        //numberOfMonths = Math.floor(numberOfMonths/12);
        System.out.println("how many procent ? ");
        procent= scanner.nextDouble();
        finalValue =startValue *Math.pow((1+ (procent/100)),(Math.floor(numberOfMonths/12)));

        int year = (int) Math.floor(numberOfMonths/12);

        System.out.println(finalValue);
        System.out.println("atert " + year + "years  yours interest is  " + (finalValue - startValue));


    }
}