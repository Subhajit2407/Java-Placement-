import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to Hotel Restaurant =====");
        System.out.println("Menu:");
        System.out.println("1. Starters");
        System.out.println("2. Main Course");
        System.out.println("3. Desserts");

        System.out.print("Enter your choice (1-3): ");
        int category = sc.nextInt();

        int price = 0;

        switch (category) {

            case 1:
                System.out.println("Starters Menu:");
                System.out.println("1. Spring Rolls - ₹120");
                System.out.println("2. Soup - ₹100");

                int starterChoice = sc.nextInt();

                if (starterChoice == 1) price = 120;
                else if (starterChoice == 2) price = 100;
                else {
                    System.out.println("Invalid Item Choice!");
                    return;
                }
                break;

            case 2:
                System.out.println("Main Course Menu:");
                System.out.println("1. Paneer Butter Masala - ₹200");
                System.out.println("2. Veg Biryani - ₹180");

                int mainChoice = sc.nextInt();

                if (mainChoice == 1) price = 200;
                else if (mainChoice == 2) price = 180;
                else {
                    System.out.println("Invalid Item Choice!");
                    return;
                }
                break;

            case 3:
                System.out.println("Desserts Menu:");
                System.out.println("1. Ice Cream - ₹90");
                System.out.println("2. Gulab Jamun - ₹80");

                int dessertChoice = sc.nextInt();

                if (dessertChoice == 1) price = 90;
                else if (dessertChoice == 2) price = 80;
                else {
                    System.out.println("Invalid Item Choice!");
                    return;
                }
                break;

            default:
                System.out.println("Invalid Category Choice!");
                return;
        }

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int total = price * quantity;

        // Final Bill
        System.out.println("================================");
        System.out.println("Thank you for your order!");
        System.out.println("Your Total Bill: ₹" + total);
        System.out.println("================================");
    }
}