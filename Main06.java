import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of items
        int n = sc.nextInt();
        int[] items = new int[n];

        // Input item prices
        for (int i = 0; i < n; i++) {
            items[i] = sc.nextInt();
        }

        double totalBill = 0;

        // Apply discount using for loop
        for (int i = 0; i < n; i++) {
            int price = items[i];
            double finalPrice;

            if (price >= 500) {
                finalPrice = price * 0.8; // 20% discount
            } else if (price >= 200) {
                finalPrice = price * 0.9; // 10% discount
            } else {
                finalPrice = price; // no discount
            }

            totalBill += finalPrice;
        }

        // Output
        System.out.println("Total Bill after discount = " + (int) totalBill);
    }
}