import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        int n = 50;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random()*n);
        }
        System.out.println(Arrays.toString(arr));
        SortClass.bublSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
