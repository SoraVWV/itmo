import java.util.Random;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        long[] s = new long[10];
        int idx = 0;
        for (int i = 20; i >= 2; i -= 2) {
            s[idx++] = i;
        }

        double[] x = new double[18];
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = -7.0 + rand.nextDouble() * (10.0 + 7.0);
        }

        double[][] l = new double[10][18];

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < x.length; j++) {
                double $x = x[j];

                if (s[i] == 14) {
                    l[i][j] = pow(
                            2 * atan(($x + 1.5) / 17.0) * (tan($x) + 0.5),
                            3
                    );
                } else if (s[i] == 4 || s[i] == 6 || s[i] == 16 || s[i] == 18 || s[i] == 20) {
                    l[i][j] = 0.25 + asin(1.0 / exp(abs($x)));
                } else {
                    double a = pow(pow($x * ($x - 1), 3), 0.25 - cos($x));
                    double b = (2.0 / 3.0) + cos($x);
                    double c = pow($x, ($x + 0.5) / 3.0);
                    double d = asin(sin(sin(pow(0.75 / ($x + 1.0), 2))));

                    l[i][j] = pow(0.5 / pow(pow(a, b), c), d);
                }
            }
        }

        for (double[] nums: l) {
            for (double num: nums) {
                System.out.printf("%10.4f ", num);
            }
            System.out.println();
        }
    }
}
