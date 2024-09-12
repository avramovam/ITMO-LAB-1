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
                    s[i][j] = pow(0.5 / (pow(x[j], ((x[j] / (x[j] + 3)) * sin(toRadians(x[j])))) + 1), 3);

                } else if (cheker(w[j])) {
                    double e = E;
                    s[i][j] = asin(cos(toRadians(log(pow(tan(toRadians(x[j])), 2)))));

                } else {
                    double n = (2 / pow(E, pow(x[j], x[j])));
                    double l = cos(toRadians(pow((2 - x[j]), 2)));
                    double r = pow(n, l);
                    s[i][j] = pow(pow((asin(1 / pow(E, abs(x[j]))) + 1) / PI, 3) * 2, r);
                }

            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                String X = String.format("%.4f", s[i][j]);
                if (j == s[i].length - 1) {
                    System.out.print(X + "\n");
                } else {
                    System.out.print(X + " ");
                }

            };
        }
    }

}