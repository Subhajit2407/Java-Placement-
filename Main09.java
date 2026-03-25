import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;

        // Calculate sum of squares from M to N
        for (int i = M; i <= N; i++) {
            sum += i * i;
        }

        // Apply conditions
        if (sum > N) {
            System.out.println(-1);
        } else {
            if (sum % 2 == 0) {
                System.out.println(sum / 2);
            } else {
                System.out.println(sum);
            }
        }
    }
}