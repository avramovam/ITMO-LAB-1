import static java.lang.Math.*;

public class Main {
    public static boolean cheker(Integer args) {
        int[] list = {4, 5, 6, 8, 9, 10, 13, 19};
        for (int j : list) {
            if (j == args) {
                return true;
            }
        }
        return false;
    }
    public static double func1(Double args) {
        double x = args;
        return pow(0.5 / (pow(x, ((x / (x + 3)) * sin(toRadians(x)))) + 1), 3);
    }
    public static double func2(Double args) {
        double x = args;
        return (cos(toRadians(log(pow(tan(toRadians(x)), 2)))));
    }
    public static double func3(Double args) {
        double x = args;
        double n = (2 / pow(E, pow(x, x)));
        double l = cos(toRadians(pow((2 - x), 2)));
        double r = pow(n, l);
        return pow(pow((asin(1 / pow(E, abs(x))) + 1) / PI, 3) * 2, r);
    }
    public static void main(String[] args) {
        int[] w = new int[16];
        double[] x = new double[10];
        double[][] s = new double[16][10];

        for (int i = 19; i > 3; i--) {
            w[19 - i] = i;
        }
        for (int i = 0; i < 10; i++ ) {
            x[i] = random() * 6 - 2;
        }
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 10; j++) {
                if (w[i] == 14) {
                    s[i][j] = func1(x[j]);

                } else if (cheker(w[j])) {
                    s[i][j] = func2(x[j]);

                } else {
                    s[i][j] = func3(x[j]);
                }

            }
        }
        for (double[] doubles : s) {
            for (int j = 0; j < doubles.length; j++) {
                String X = String.format("%.4f", doubles[j]);
                if (j == doubles.length - 1) {
                    System.out.print(X + "\n");
                } else {
                    System.out.print(X + " ");
                }

            }
        }
    }

}