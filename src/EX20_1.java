import edu.princeton.cs.algs4.StdOut;


    public class EX20_1 {

    public static double multiln(int N) {

        if(N == 1)  return 1;
        else
            return N*multiln(N-1);

    }

    public static void main(String[] args) {

        int N = 6;

        StdOut.println("ln("+N+"!) = "+ Math.log(multiln(N)));


    }
}
