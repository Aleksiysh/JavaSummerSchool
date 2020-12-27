import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner("abcdef fedcloj");
        String str = in.nextLine();
        String[] arrWords = str.split(" ");
        for (int i = 0; i < arrWords[0].length(); i++) {
            char tmp = arrWords[0].charAt(i);
            if (!cont(arrWords[1], tmp)) {
                System.out.print(tmp);
            }
        }
        for (int i = 0; i < arrWords[1].length(); i++) {
            char tmp = arrWords[1].charAt(i);
            if (!cont(arrWords[0], tmp)) {
                System.out.print(tmp);
            }
        }
    }

    static boolean cont(String str, char c) {
        for (int i = 0; i < str.length(); i++)
            if (c == str.charAt(i))
                return true;
        return false;
    }
}
