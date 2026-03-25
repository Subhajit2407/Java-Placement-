import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today's Activity: Math Class");
                break;
            case 2:
                System.out.println("Today's Activity: Science Class");
                break;
            case 3:
                System.out.println("Today's Activity: English Class");
                break;
            case 4:
                System.out.println("Today's Activity: Sports");
                break;
            case 5:
                System.out.println("Today's Activity: Art & Craft");
                break;
            case 6:
                System.out.println("Today's Activity: Field Trip");
                break;
            case 7:
                System.out.println("Today's Activity: Holiday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}