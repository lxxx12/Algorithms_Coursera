import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

        import java.util.Arrays;

public class EX28 {

    public static int[] rank(int[] a) {
        int[] realw = new int[a.length];

        int j = 1;
        realw[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] != a[i-1]) {
                realw[j] = a[i];
                j++;
            }
        }
        return Arrays.copyOfRange(realw, 0, j);

    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);


        int[] rw = rank(whitelist);

        for (int i = 0; i < rw.length; i++) {
            StdOut.println(rw[i]);
        }



    }
}