import algorithms.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortingAlgorithm[] algorithms = new SortingAlgorithm[]{
                new BubbleSort(),
                new DirectInsert(),
                new InsertionSort(),
                new MergeSort(),
                new QuickSort(),
        };
        System.out.println("Random:");
        int[] arr =TestDataGenerator.arrayRandomAnlegen(10000);

        for(SortingAlgorithm s : algorithms){
            double before = System.currentTimeMillis();
            int[] sorted = s.sort(arr);
            //System.out.println(Arrays.toString(sorted));
            double after = System.currentTimeMillis();
            System.out.println(s.getName()+": "+(after - before)+"ms");
        }

        System.out.println("\n\nhalf sorted");
        arr =TestDataGenerator.arrayVorsortiertAnlegen(10000);

        for(SortingAlgorithm s : algorithms){
            double before = System.currentTimeMillis();
            int[] sorted = s.sort(arr);
            //System.out.println(Arrays.toString(sorted));
            double after = System.currentTimeMillis();
            System.out.println(s.getName()+": "+(after - before)+"ms");
        }


    }
}
