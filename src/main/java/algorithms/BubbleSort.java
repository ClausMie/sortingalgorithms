package algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort implements SortingAlgorithm{
    public String getName(){
        return "BubbleSort";
    }

    public int[] sort(int[] numbers){
        boolean changedSomething = false;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i; j < numbers.length-i-1; j++) {
                if(numbers[j] > numbers[j+1]){
                    int tempInt = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tempInt;
                    changedSomething = true;
                  //  System.out.println(arrayToString(numbers));
                }
            }

            if (changedSomething){
                changedSomething = false;
            } else {
                return numbers;
            }
        }
        return numbers;
    }
    public String arrayToString(int[] numbers){
       // String result = "[";
        String numbersString = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        return "[" + numbersString + "]";



       /* for (int i = 0; i < numbers.length; i++) {
            result += numbers[i] + ", ;
        }
        result.substring(0,result.length()-1);
        result += ']';


        return result; */
    }
}
