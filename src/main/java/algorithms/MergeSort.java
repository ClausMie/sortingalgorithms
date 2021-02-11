package algorithms;

import java.util.Arrays;

public class MergeSort implements SortingAlgorithm {
    public String getName(){
        return "MergeSort";
    }
    public int[] sort(int[] a) {


        if (a.length > 1) {
            int[] b = Arrays.copyOfRange(a, 0, (int) Math.floor(a.length / 2d));
            int[] c = Arrays.copyOfRange(a, (int) Math.floor(a.length / 2d), a.length);

            sort(b);
            sort(c);

            merge(b, c, a);
        }
        return a;

    }

    public static void merge(int[] b, int[] c, int[] a) {
        int
                i = 0,
                j = 0,
                k = 0;

        do {
            if (b[i] <= c[j]) {
                a[k] = b[i];
                i++;
            } else {
                a[k] = c[j];
                j++;
            }
            k++;
        }
        while (i < b.length && j < c.length);

        if (i == b.length) {
            for (int l = j; l < c.length; l++) {
                a[b.length + l] = c[l];
            }
        } else {
            for (int l = i; l < b.length; l++) {
                a[c.length + l] = b[l];
            }
        }

    }
}
