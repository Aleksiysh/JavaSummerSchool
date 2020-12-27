import java.util.ArrayList;
import java.util.Scanner;

public class s1508 {
    public static void main(String[] args) {
        Scanner in = new Scanner("5\n" +
                "1 2 3 4 5\n" +
                "7\n" +
                "5 4 3 1 2 6 7");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int n = in.nextInt();
            for (int j = 0; j < n; j++)
                arr.add(in.nextInt());
        }
        arr.sort((a, b) -> b - a);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
