public class SortClass {
    public static void bublSort(int[] arr) {
        for (int i = arr.length; i > 0; i--)
            for (int j = 0; j < i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
    }
}
