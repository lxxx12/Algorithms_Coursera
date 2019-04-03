import edu.princeton.cs.algs4.StdOut;

public class EX30 {

    public static int Prinum(int p, int q) {

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
//            StdOut.printf("p: %d, q: %d\n", q, p%q);
            return Prinum(q, p % q);
        }

    }


    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        boolean[][] a = new boolean[N+1][N+1];


        for (int i = 0; i < N + 1 ; i++) {

            for (int j = 0; j < N + 1 ; j++) {

                if (Prinum(i, j) > 1) a[i][j] = false;
                else a[i][j] = true;
                StdOut.println(i + " " + j + " :"+ a[i][j]);

            }

        }


    }

}
