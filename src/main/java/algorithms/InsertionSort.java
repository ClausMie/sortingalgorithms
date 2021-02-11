package algorithms;

public class InsertionSort implements SortingAlgorithm {
    public String getName(){
        return "InsertionSort";
    }
    public int[] sort(int []array){
        int value;
        int j;
        for(int i = 1; i < array.length; i++){
            value = array[i];
            j = i - 1;
            while (j >= 0 && array[j]> value){
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = value;
        }
//        for (int k = 0; k < array.length; k++) {
//            System.out.println(array[k]);
//        }
        return array;
    }
}
