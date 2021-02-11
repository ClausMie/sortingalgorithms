package algorithms;

public class DirectInsert implements SortingAlgorithm{
    public String getName(){
        return "DirectInsert";
    }
    public int[] sort(int[] numbers){
        for (int i = 1; i < numbers.length-1; i++) {
            int j = i-1;
            while(j>=0 && numbers[i] < numbers[j]){
                j -=1;
            }
            int tempInt = j+1; //Very last j-=1 is not the correct place to insert. j+1 is.
            numbers[j+1] = numbers[i];
            numbers[i] = tempInt;
        }
        return numbers;
    }
}
