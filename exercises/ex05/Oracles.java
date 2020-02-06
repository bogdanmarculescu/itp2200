package ex05;

public class Oracles {

    /**
     * The [sinus] is meant to compute the value of the sinus function for a given input.
     * Note that, while the implementation below is reliant on the Math library, it is
     * quite suitable for testing purposes.
     */
    public static double sinus(double input){
        return Math.sin(input);
    }

    public static double cosinus(double input){
        return Math.cos(input);
    }
    /**
     * A simple [division] function.
     */

    public static double division(double numerator, double denominator) throws IllegalArgumentException{
        if (denominator == 0) throw new IllegalArgumentException();
        return numerator/denominator;
    }

    /**
     * Computing e^input
     */
    public static double exp(double input){
        return Math.exp(input);
    }

    /**
     * Simple array sorting
     */
    public static double[] sortArray(double[] array){
        int n = array.length;
        double[] result = array.clone();
        double temp = 0;
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
    public static double minimum(double first, double second){
        if (first <= second) return first;
        else return second;
    }
    public static void printArray(double[] array){
        System.out.print(" Sorted array -> ");
        for(int i=0; i < array.length; i++)
        { System.out.print(array[i] + " "); }
        System.out.println();

    }
}
