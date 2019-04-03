import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class EX23 {

    public static int rank(int key, int[] a){
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int deep) {

        if(lo > hi) return  -1;
        int mid = lo +(hi - lo)/2;

        if(key > a[mid]) return rank(key, a, mid+1, hi, deep+1);
        else if(key < a[mid]) return rank(key, a, lo, mid-1, deep +1);
        else {
            //System.out.printf("The deep is: %d\n", deep);
            return mid;
        }

    }

    public static void main(String[] args) {

        In in = new In(args[0]);
        int[] whitelist;
        whitelist = in.readAllInts();
        Arrays.sort(whitelist);

        char flag = StdIn.readChar();

        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            int pos = rank(key, whitelist);
            if(flag == '+') {
                if(pos < 0)
                    StdOut.println(key);
            }
            if(flag == '-'){
                if(pos>0)
                    StdOut.println(whitelist[pos]);
            }

        }

    }

}
