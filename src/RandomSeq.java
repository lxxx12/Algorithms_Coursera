import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq {

    public static void main(String[] args) {


        for(int i = 0; i < 5; i++ ){
            double x = StdRandom.uniform(100.0,200.0);
            StdOut.printf("%.2f\n", x);
        }
    }

}

