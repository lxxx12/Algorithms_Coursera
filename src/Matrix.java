import edu.princeton.cs.algs4.StdOut;

public class Matrix{

    public static double dot(double[] x, double[] y) {

        if(x.length != y.length) StdOut.printf("wrong input!");
        double dotcount = 0.0;
        for (int i = 0; i < x.length ; i++) {

            dotcount = x[i] * y[i] +dotcount;

        }
        return dotcount;
    }

    public static double[][] mult(double[][] a, double[][] b){
        
        if(a[0].length != b.length) StdOut.printf("wrong input!");
        double[][] multcount = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    multcount[i][j] = a[i][k] * b[k][j] + multcount[i][j];
                }
            }
        }
        return multcount;

    }

    public static double[][] transpose(double[][] a){

        double[][] tr = new double[a[0].length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[0].length; j++) {

                tr[i][j] = a[j][i];
            }
        }

        return tr;

    }

    public static double[] mult(double[][] a, double[] x) {

        if (a[0].length == x.length) {
            double[] y = new double[a.length];
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < x.length; j++) {
                    y[i] += a[i][j] * x[j];
                }
            }
            return y;
        } else {
            return null;
        }
    }


    public static double[] mult(double[] y, double[][] a) {
        if (y.length == a.length) {
            double[] x = new double[a[0].length];
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    x[i] += y[j] * a[j][i];
                }
            }
            return x;
        } else {
            return null;
        }
    }


}