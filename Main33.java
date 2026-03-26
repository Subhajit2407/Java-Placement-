import java.util.*;

public class Main33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        str1 = str1 + str2;

        str2 = str1.substring(0, str1.length() - str2.length());


        str1 = str1.substring(str2.length());

        // Output
        System.out.println("After swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}