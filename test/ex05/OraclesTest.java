package ex05;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class OraclesTest {

    @Test
    public void testDivision(){
        double[] numerators = {1, 13, 61, 54, 34, 43};
        double[] denominators = {57, 98, 39, 99, 10 ,5};

        System.out.println("Testing Division");

        for (int i = 0; i < Oracles.minimum(numerators.length, denominators.length); i++){
            double re = Oracles.division(numerators[i], denominators[i]);
            System.out.println(re);
        }
    }

    @Test
    public void testSinus(){
        double[] inputs = {42};

        System.out.println("Testing Sinus:");

        for (int i = 0; i < inputs.length; i++){
            double re = Oracles.sinus(inputs[i]);
            System.out.println(" - " + inputs[i] + " - " + re);

        }
    }


    @Test
    public void testSortArray2(){
        double[] inputs = {0, 122, 15, 17, 145, 19, 756};

        double[] result = Oracles.sortArray(inputs);
        Arrays.sort(inputs);
        Oracles.printArray(result);

        for (int i = 0; i < result.length - 1; i++){
            //if(result[i] <= result[i+1]){ }
            assertTrue(result[i] <= result[i+1]);
        }

    }

    @Test
    public void testExp(){
        double[] inputs = {1, 13, 61, 54, 34, 43};

        for (int i = 0; i < inputs.length; i++){
            double result = Oracles.exp(inputs[i]);

            //assertTrue(result * Oracles.exp(-inputs[i]) == 1);
            System.out.println(result * Oracles.exp(-inputs[i]));
        }
    }


}
