import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class EX38 {

    public static void main(String[] args) {
        In in  = new In(args[0]);
        int[] whitelist = in.readAllInts();
        long starttime = System.currentTimeMillis();
        //long endtime = System.currentTimeMillis();
        int key = StdIn.readInt();

        if (BruteForceSearch.rank(key,whitelist) < -1){
            StdOut.println(key);
        }





        long endtime = System.currentTimeMillis();

        System.out.println("The runtime of BruteForceSearch is: "+ (endtime-starttime));

        starttime = System.currentTimeMillis();

        Arrays.sort(whitelist);

        if (BinarySearch.rank(key,whitelist)==-1) {

            StdOut.println(key);
        }

        endtime = System.currentTimeMillis();

        System.out.println("The runtime of BinarySearch is:"+ (endtime-starttime));

    }

}
