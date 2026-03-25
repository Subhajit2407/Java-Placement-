import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;
        int failedCount = 0;

        for (int i = 0; i < n; i++) {
            int mark = marks[i];

            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;

            sum += mark;

            if (mark < 40) failedCount++;
        }

        double average = (double) sum / n;

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Average = " + average);
        System.out.println("Failed Students = " + failedCount);
    }
}