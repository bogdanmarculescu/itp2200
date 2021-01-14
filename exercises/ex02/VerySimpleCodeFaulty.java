package ex02;

public class VerySimpleCodeFaulty {

    public static void printNumberFaulty(int number) {
        if (number!=10 || 10%(number-10) == 0) {
            System.out.println("You didn't choose number 10!");
        }

        System.out.println(number);
    }
}
