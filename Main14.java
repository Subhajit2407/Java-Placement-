import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance
        int distance = sc.nextInt();

        int fare;

        // Apply fare rules
        if (distance <= 2) {
            fare = 30;
        } else if (distance <= 5) {
            fare = 50;
        } else if (distance <= 10) {
            fare = 80;
        } else {
            fare = 100 + (distance - 10) * 10;
        }

        // Output
        System.out.println("Fare: ₹" + fare);
    }
}