import edu.princeton.cs.algs4.StdOut;

public class EX20 {

    public static double[] calln(int N) {

        double[] ln1 = new double [N+1];
        double[] ln2 = new double [N+1];
        ln1 [1]  = 0;
        double sum = 0;
        for(int i = 2; i < N+1; i ++){
            ln1 [i] = Math.log(i);
            ln2 [i] = ln1[i] + sum;
            sum = ln2 [i];
        }
        return ln2;

    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[] arr = calln(N);
        for(int i = 1; i < N+1; i++){

            StdOut.println("ln("+i+"!) = "+arr[i]);

        }

    }
}
