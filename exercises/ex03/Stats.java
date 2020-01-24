package ex03;

// Code example from Introduction to Software Testing, Ammann and Offutt

public class Stats {
    public static void computeStats (int [ ] numbers)
    {
        int length = numbers.length;
        double med, var, sd, mean, sum, varsum;

        sum = 0.0;
        for (int i = 0; i < length; i++) {
            sum += numbers [ i ];
        }
        med   = numbers [ length / 2 ];
        mean = sum / (double) length;

        varsum = 0.0;
        for (int i = 0; i < length; i++) {
            varsum = varsum  + ((numbers [ i ] - mean) * (numbers [ i ] - mean));
        }
        var = varsum / ( length - 1 );
        sd  = Math.sqrt ( var );

        System.out.println ("length:                   " + length);
        System.out.println ("mean:                    " + mean);
        System.out.println ("median:                 " + med);
        System.out.println ("variance:                " + var);
        System.out.println ("standard deviation: " + sd);
    }

}
