import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        String[] seats = new String[n];

        // Initialize all seats as Empty
        for (int i = 0; i < n; i++) {
            seats[i] = "Empty";
        }

        int choice;

        do {
            System.out.println("\n===== Bus Seat Booking System =====");
            System.out.println("1. View all seats");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel a booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                  
                    System.out.println("\nSeat Status:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Seat " + (i + 1) + ": " + seats[i]);
                    }
                    break;

                case 2:
                   
                    System.out.print("Enter seat number to book: ");
                    int bookSeat = sc.nextInt();
                    sc.nextLine();

                    if (bookSeat < 1 || bookSeat > n) {
                        System.out.println("Invalid seat number!");
                    } else if (!seats[bookSeat - 1].equals("Empty")) {
                        System.out.println("Seat already booked!");
                    } else {
                        System.out.print("Enter passenger name: ");
                        String name = sc.nextLine();
                        seats[bookSeat - 1] = name;
                        System.out.println("Seat booked successfully!");
                    }
                    break;

                case 3:
                 
                    System.out.print("Enter seat number to cancel: ");
                    int cancelSeat = sc.nextInt();

                    if (cancelSeat < 1 || cancelSeat > n) {
                        System.out.println("Invalid seat number!");
                    } else if (seats[cancelSeat - 1].equals("Empty")) {
                        System.out.println("Seat is already empty!");
                    } else {
                        seats[cancelSeat - 1] = "Empty";
                        System.out.println("Booking cancelled successfully!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting system... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}