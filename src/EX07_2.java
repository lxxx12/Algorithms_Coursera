import edu.princeton.cs.algs4.StdOut;

public class EX07_2 {
    public static void main(String[] args) {
        int sum =0;
        for(int i = 1;i < 1000; i++)
            for(int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }
}
