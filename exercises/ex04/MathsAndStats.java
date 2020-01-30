package ex04;

public class MathsAndStats {
    public static int absoluteValue(int input){
        if(input >= 0) return input;
        else return -input;
    }

    public static int categorize(int input){
        int result = 0;
        if (input > 0) {
            result = 1; //Return 1 if the number is positive
        }
        else {
            if (input < 0) result = -1; //Return -1 if the number is negative
        }
        return result;
    }

    public static String quadrants(int x, int y){
        if(x >= 0){
            if(y>= 0){
                return "Upper-Right";
            }
            else{
                return "Lower-Right";
            }
        }
        else {
            if(y>=0){
                return "Upper-Left";
            }
            else{
                return "Lower-Left";
            }
        }
    }

}
