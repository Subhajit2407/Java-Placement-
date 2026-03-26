import java.util.*;

public class Main27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;

        while (num > 0) {
            int digit = num % 10;
            int square = digit * digit;

            if (square >= 10) {
                result = result * 100 + square; 
            } else {
                result = result * 10 + square;
            }

            num /= 10;
        }


        int finalResult = 0;
        while (result > 0) {
            finalResult = finalResult * 10 + (result % 10);
            result /= 10;
        }

        System.out.println(finalResult);
    }
}