import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rahulFree = sc.nextBoolean();
        boolean snehaFree = sc.nextBoolean();
        boolean arjunFree = sc.nextBoolean();

        int count = 0;
        if (rahulFree) count++;
        if (snehaFree) count++;
        if (arjunFree) count++;
        if (count == 3) {
            System.out.println("All three are free! They will go on a road trip.");
        } else if (count == 2) {
            System.out.println("Two friends are free! They will go to a cricket match.");
        } else if (count == 1) {
            System.out.println("Only one friend is free! They will play video games at home.");
        } else {
            System.out.println("No one is free! Everyone will sleep at home.");
        }
    }
}