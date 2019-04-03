import edu.princeton.cs.algs4.StdOut;

public class EX24 {

    public static int Euclid(int p,int q) {



        if (p==0||q==0) return 1;
        if (p < q) {
            int t = p;
            p = q;
            q = t;
        }
        if (p % q ==0) {
            return q;
        }
        else {
            StdOut.printf("p: %d, q: %d\n", q, p%q);
            return Euclid(q, p % q);
        }


    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);

        StdOut.printf("(The maximum common divisor of %d and %d is: %d)", p, q, Euclid(p,q));
    }
}
