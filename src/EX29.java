import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class EX29 {


    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length-1;

        while(lo <= hi){
            int mid = lo+ (hi-lo)/2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else {
                while (a[mid-1]==a[mid]){
                    mid--;
                }
                return mid;
            }
        }
        return -1;
    }

    public static int count(int key, int[]a,int pos){

        int c = 1;
        for (int i = pos + 1; i < a.length; i++) {
            if(a[i] == key){
                c = c + 1;
            }
            else
                return c;
        }
        return c;

    }


    public static void main(String[] args) {

        In in = new In(args[0]);
        int[] whitelist;
        whitelist = in.readAllInts();

        Arrays.sort(whitelist);

        for (int i = 0; i < whitelist.length; i++) {
            StdOut.println(whitelist[i]);
        }

        int key = StdIn.readInt();
        int pos = rank(key,whitelist);

        if(pos < 0){

            StdOut.printf("cannot find");

        }
        else {
            int rp = count(key, whitelist, pos);
            StdOut.printf("The pos is : %d, and the repeat count is: %d", pos, rp);
        }

    }
}
