package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void testBubbleSort(){
        BubbleSort sorter = new BubbleSort();
        int[] valuesToSort = {10,5,100,99,97,130};
        int[] sortedValues = {5,10,97,99,100,130};

        assertArrayEquals(sortedValues,sorter.bubbleSort(valuesToSort));
    }
}
