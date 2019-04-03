import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {

    public static void main(String[] args) {
        double sum = 0;
        int cnt = 0;
        while(StdIn.readInt()!=0){
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("average is %5f\n",avg);

    }
}
