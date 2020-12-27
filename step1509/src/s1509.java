import java.util.ArrayList;
import java.util.Scanner;

public class s1509 {
    public static void main(String[] args) {
        Scanner in = new Scanner("1 51 61 51 51 3153 48111 2 121 51 8 1 51 5 1 1 5\n" +
                "51 515 1181 1 1 512 215 15 151 8 98 54 545 48 8 78 945191 91 ");
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrInt1 = new ArrayList<>();
        ArrayList<Integer> arrInt2 = new ArrayList<>();
        String[] arr1 = in.nextLine().split(" ");
        for (String str : arr1)
            arrInt1.add(Integer.parseInt(str));
        String[] arr2 = in.nextLine().split(" ");
        for (String str : arr2)
            arrInt2.add(Integer.parseInt(str));

        arrInt1.retainAll(arrInt2);
        arrInt1.sort((a,b)->a-b);
        arrInt2.clear();
        for (int i:arrInt1)
            if(!arrInt2.contains(i))
                arrInt2.add(i);
        for (int i:arrInt2)
            System.out.print(i+" ");
    }
}
