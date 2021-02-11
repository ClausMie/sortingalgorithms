import algorithms.BubbleSort;
import algorithms.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        QuickSort sort = new QuickSort();
        int[] arr = new int[]{1,6,2,9,2,2};
        sort.sort(arr);

        System.out.println(Arrays.toString(sort.sort(arr)));
    }
}
