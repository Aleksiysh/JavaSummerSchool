import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.printf("%d + %d + %d = %d\n", a, b, c, a + b + c);
        System.out.printf("%d * %d * %d = %d\n", a, b, c, a * b * c);
        System.out.printf("(%d + %d) * %d = %d\n", a, b, c, (a + b) * c);

        System.exit(0);
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        System.out.println(a);
//        BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in));
//        int b = 0;
//        b = Integer.parseInt(bufin.readLine());
//        System.out.println(b);
//        System.out.println("Hello World!");


    }
}
