package ex02;

public class SortingHelper {


    // Input: array of ints
    // Expected behaviour: array of ints in ascending order

    public static int[] sortArray(int[] array){
        int n = array.length;
        int[] result = array.clone();
        int temp = 0;
        for(int i=0; i < n; i++) // Looping through the array length
        {
            for(int j=1; j < (n-i); j++)
            {
                if(result[j-1] > result[j])
                {
                    //swap elements
                    temp = result[j-1];
                    result[j-1] = result[j];
                    result[j] = temp;
                }

            }
        }

        return result;
    }

    public static void printArray(int[] array){

        for(int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

}

