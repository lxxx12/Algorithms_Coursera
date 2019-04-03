import edu.princeton.cs.algs4.StdOut;

public class EX19_1 {

    public static long[] F(int N) {
        long[] a  = new long[N+1];
        if(N == 0) return a;
        else if(N == 1) {
            a[1] = 1;
            return a;
        }
        else{
            a[1] = 1;
            for(int i = 2; i < N+1; i++){
                a[i] = a[i-1] + a[i-2];
            }
            return a;
        }


    }


    public static void main(String[] args) {
        long[] arr = F(99);
        for(int i = 0; i < arr.length; i++){
            StdOut.println(i + " " + arr[i]);
        }


    }
}
