import java.util.ArrayList;
import java.util.Scanner;

public class step15 {
    public static void main(String[] args) {
        Scanner in = new Scanner("create 30\n" +
                "add 12\n" +
                "add 17\n" +
                "add 3 15\n" +
                "remove 4\n" +
                "set 12 34\n" +
                "printList");
        String[] str = in.nextLine().split(" ");
        int n = Integer.parseInt(str[1]);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++)
            arr.add(i + 1);
        while (true) {
            String[] arrStr = in.nextLine().split(" ");
            if (arrStr[0].equals("printList")) break;
            if (arrStr[0].equals("add")) {
                if (arrStr.length == 2)
                    arr.add(Integer.parseInt(arrStr[1]));
                else
                    arr.add(Integer.parseInt(arrStr[1]), Integer.parseInt(arrStr[2]));
            }
            if (arrStr[0].equals("remove"))
                arr.remove(Integer.parseInt(arrStr[1]));
            if (arrStr[0].equals("set"))
                arr.set(Integer.parseInt(arrStr[1]), Integer.parseInt(arrStr[2]));
        }
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }
}

