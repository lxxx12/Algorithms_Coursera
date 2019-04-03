import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class EX39 {

    public static int RanMatch(int N ){

        int N1 = (int) Math.pow(10,N);
        int[] a = new int[N1];
        int[] b = new int[N1];

        for (int i = 0; i < N1; i++) {
            a[i] = StdRandom.uniform(100000,1000000);
            b[i] = StdRandom.uniform(100000,1000000);
        }

        int count = 0;
        Arrays.sort(b);

        for (int i = 0; i < N1; i++) {
            if (BinarySearch.rank(a[i],b) !=-1)
                count++;
        }

        return count;
    }

    
    public static void main(String[] args) {

        int T = Integer.parseInt(args[0]);

        double[] arg = new double[4];


        for (int i = 0; i <=3; i++) {
            for (int j = 0; j < T; j++) {
                arg[i] += RanMatch(i+3);
            }
            arg[i] = arg[i]/T;
        }

        for (int i = 0; i <= 3; i++) {
            StdOut.println("10^"+ (i+3) +" "+ arg[i]);
        }

    }

}
