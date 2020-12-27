import java.util.ArrayList;
import java.util.Scanner;

public class s1509 {
    public static void main(String[] args) {
        Scanner in = new Scanner("1 51 61 51 51 3153 48111 2 121 51 8 1 51 5 1 1 5\n" +
                "51 515 1181 1 1 512 215 15 151 8 98 54 545 48 8 78 945191 91 ");
        ArrayList<Integer> arr = new ArrayList<>();
        String[] arr1 = in.nextLine().split(" ");
        String[] arr2 = in.nextLine().split(" ");
        for (String s : arr1) {
            if (contStr(arr2, s))
                if (!contInt(arr, Integer.parseInt(s)))
                    arr.add(Integer.parseInt(s));
        }
        arr.sort((a, b) -> a - b);
        for (int i : arr)
            System.out.print(i + " ");
    }

    static boolean contStr(String[] arr, String str) {
        for (String s : arr)
            if (s.equals(str)) return true;
        return false;
    }

    static boolean contInt(ArrayList<Integer> arr, int i) {
        for (int s : arr)
            if (s == i) return true;
        return false;
    }
}
