import java.util.*;

public class Main28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int lastDigit = num % 10;


        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int sum = firstDigit + lastDigit;

        System.out.println(sum);
    }
}