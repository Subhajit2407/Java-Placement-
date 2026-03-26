import java.util.*;

public class Main32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        boolean isEqual = true;

        if (str1.length() != str2.length()) {
            isEqual = false;
        } else {

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println(isEqual);
    }
}