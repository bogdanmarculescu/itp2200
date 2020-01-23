package ex03;

import ex03.TriangleType;

public class TriangleClassifier {
    public static String classify(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return "NOT_A_TRIANGLE";
        }

        if (a == b && b == c) {
            return "EQUILATERAL";
        }

        int max = Math.max(a, Math.max(b, c));

        if ((max == a && max - b - c >= 0) ||
                (max == b && max - a - c >= 0) ||
                (max == c && max - a - b >= 0)) {
            return "NOT_A_TRIANGLE";
        }

        if (a == b || b == c || a == c) {
            return "ISOSCELES";
        } else {
            return "SCALENE";
        }
    }

    public static TriangleType classify_v2(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return TriangleType.NOT_A_TRIANGLE;
        }

        if (a == b && b == c) {
            return TriangleType.EQUILATERAL;
        }

        int max = Math.max(a, Math.max(b, c));

        if ((max == a && max - b - c >= 0) ||
                (max == b && max - a - c >= 0) ||
                (max == c && max - a - b >= 0)) {
            return  TriangleType.NOT_A_TRIANGLE;
        }

        if (a == b || b == c || a == c) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }
}
