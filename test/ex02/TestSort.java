package ex02;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {

    @Test
    public void testSort(){
        int[] input_array = {17, 13, 5, 19, 71, 31, 256, 23, 171, 9000, 42};

        int[] sortedArray = SortingHelper.sortArray(input_array);

        SortingHelper.printArray(input_array);

        System.out.println("-----");

        SortingHelper.printArray(sortedArray);

        //Other checks we might want to do?

        boolean sorted = true;
        for(int i=0; i < sortedArray.length-1; i++){
            if(sortedArray[i] > sortedArray[i+1]) {
                sorted = false;
            }
        }

        boolean sorted_input = true;
        for(int i=0; i < input_array.length-1; i++){
            if(input_array[i] > input_array[i+1]) {
                sorted_input = false;
            }
        }

        assertTrue(sorted);

        System.out.println("I'm done");
    }

}
