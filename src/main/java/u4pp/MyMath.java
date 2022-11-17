package u4pp;

public class MyMath {

    public static int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return x * -1;
        }
    }

    public static double abs(double x) {
        if (x >= 0.0) {
            return x;
        } else {
            return x * -1.0;
        }
    }

    public static double pow(double base, int exponent) {
        double num = 1.0;
        if (exponent == 0) {
            return 1.0;
        } else {
            for (int i = 0; i < exponent; i++) {
                num *= base;
            }
            return num;
        }
    }

    public static int perfectSqrt(int x) {
        if (x < 0) {
            return -1;
        } else if (x < 2) {
            return x;
        } else {
            for (int i = 0; i < x; i++) {
                if (i * i == x) {
                    return i;
                }
            }
            return -1;
        }

    }

}
// input | output
// 0 | 0
// 1 | 1
// 2 | -1
// 3 | -1
// 4 | 2
// 9 | 3
// 10 | -1

// observation:
// 1. output * output == input
// 2. 0 <= output <= input

// if input < 0:
// return -1
// else if input < 2:
// return input
// else:
// for i = 0; i < input; i++
// if i * i == input:
// return i
// return -1 // nothing happened

// - `static int perfectSqrt(int x)` which returns the square root of x if there
// is a whole number that
// a square root. It returns -1 otherwise.

// You may include any other `private` methods and instance variables you think
// applicable.
// You should have nothing else that
// `public` other than what is listed above.
