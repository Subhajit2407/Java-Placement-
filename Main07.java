import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String signal = sc.nextLine();
        signal = signal.toLowerCase();
        switch (signal) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}