import java.util.ArrayList;
import java.util.Scanner;

public class s1510 {
    public static void main(String[] args) {
        Scanner in = new Scanner("abcde");
        String str = in.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++)
            System.out.print(str.charAt(i) + " ");
        System.out.print('\n');
        for (int i = 1; i < n - 1; i++) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(str.charAt(i) + " ");
            for (int j = 1; j < n - 1; j++)
                arr.add("0 ");
            arr.add(str.charAt(n - 1 - i) + " ");
            for (String s : arr)
                System.out.print(s);
            System.out.print('\n');
        }

        for (int i = n - 1; i >= 0; i--)
            System.out.print(str.charAt(i) + " ");
    }
}
