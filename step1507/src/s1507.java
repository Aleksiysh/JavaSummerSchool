import java.util.ArrayList;
import java.util.Scanner;

public class s1507 {
    public static void main(String[] args) {
        Scanner in = new Scanner("1 2 3 4 -2 -2 -2 -2\n" +
                "2 5 4 3 9 7 8 1 7 12 16\n" +
                "7 21 15 16 19 18");
        int n;
        String[] arr1 = in.nextLine().split(" ");
        String[] arr2 = in.nextLine().split(" ");
        String[] arr3 = in.nextLine().split(" ");
        ArrayList<Integer> res = new ArrayList<>();
        for (String str : arr1) {
            n = Integer.parseInt(str);
            if (n > 0)
                res.add(n);
        }
        for (String str : arr2) {
            n = Integer.parseInt(str);
            if (n % 2 == 0)
                res.add(n);
        }
        for (String str : arr3) {
            n = Integer.parseInt(str);
            if (n % 7 == 0)
                res.add(n);
        }
        res.sort((a, b) -> a - b);
        for (int i : res
        ) {
            System.out.print(i + " ");
        }
    }
}
