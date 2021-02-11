package algorithms;

import java.util.Arrays;

public class QuickSort implements SortingAlgorithm{
    public String getName(){
        return "QuickSort";
    }

    public int[] sort(int[] arr){
        int[] arrWithLastFakeInt = this.addLastFakeInt(arr);
        int[] sortedWithFakeInt = this.sortIntern(arrWithLastFakeInt, 0, arrWithLastFakeInt.length-1);
        int[] sortedWithOutFakeInt = this.removeLastFakeInt(sortedWithFakeInt);
        return sortedWithOutFakeInt;
    }

    private int[] sortIntern(int[] arr, int l, int r){
        if(l < r){
            int s = this.partition(arr, l, r);
            this.sortIntern(arr, l, s-1);
            this.sortIntern(arr, s+1, r);
        }
        return arr;
    }

    private int partition(int[] arr, int l, int r){
        int pivot = arr[l];
        int i = l-1;
        int j = r+1;
        do{
            do { i++; } while(arr[i] < pivot);
            do { j--; } while(arr[j] > pivot);
            if (i < j) swap(arr, i, j);
        }
        while (i<j);
        return j;
    }

    private static void swap(int[] arr, int i, int j){
        int tempI = arr[i];
        arr[i] = arr[j];
        arr[j] = tempI;
    }

    private int[] addLastFakeInt(int[] arr){
        int[] arrWithFake = Arrays.copyOf(arr, arr.length+1);
        arrWithFake[arr.length] = Integer.MAX_VALUE;
        return arrWithFake;
    }

    private int[] removeLastFakeInt(int[] arr){
        int[] arrWithoutFake = Arrays.copyOf(arr, arr.length-1);
        return arrWithoutFake;
    }
}
