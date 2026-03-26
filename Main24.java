import java.util.*;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int positive = 0, negative = 0, zero = 0;

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

 
        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}