import java.util.*;

public class Main22 {
    public static int SmallLargeSum(int[] arr) {

        if (arr == null || arr.length <= 3) {
            return 0;
        }

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }

        if (evenList.size() < 2 || oddList.size() < 2) {
            return 0;
        }

        Collections.sort(evenList, Collections.reverseOrder());
        Collections.sort(oddList, Collections.reverseOrder());

        int secondLargestEven = evenList.get(1);
        int secondLargestOdd = oddList.get(1);

        return secondLargestEven + secondLargestOdd;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7, 5, 4};
        System.out.println(SmallLargeSum(arr)); // Output: 7
    }
}