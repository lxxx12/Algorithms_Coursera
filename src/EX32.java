import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class EX32 {

    public static void main(String[] args) {
        In in = new In(args[0]);
        double[] ins = in.readAllDoubles();

        int N = StdIn.readInt();
        double l = StdIn.readDouble();
        double r = StdIn.readDouble();

        double len = (r - l) / N;
        int[] count = new int[N];

        Arrays.sort(ins);



        for (int i = 0; i < ins.length; i++) {
            StdOut.println(ins[i]);


            double c = (ins[i] - l)/len;

            count[(int) c] ++;

        }

        for (int i = 0; i < N ; i++) {//x，y is 0-1

            StdOut.println(count[i]);

            double x = 1.0 * i / N;
            double y = count[i] / 2.0/ N;
            double rw = 0.5 / N;
            double rh = count[i] / 2.0/ N;

            StdDraw.filledRectangle(x, y, rw, rh);
        }




    }

}
