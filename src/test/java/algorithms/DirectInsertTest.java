package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DirectInsertTest {
    @Test
    public void testDirectInsert(){
        DirectInsert sorter = new DirectInsert();
        int[] unsortedValues = {10,5,100,99,97,130};
        int[] sortedValues = {5,10,97,99,100,130};
        assertArrayEquals(sortedValues, sorter.directInsert(unsortedValues));
    }
}
