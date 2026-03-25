import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();

        int fare;

        if (distance <= 5) {
            fare = 100;
        } else if (distance <= 15) {
            fare = distance * 10;
        } else {
            fare = distance * 8;
        }

        System.out.println("Fare = ₹" + fare);
    }
}