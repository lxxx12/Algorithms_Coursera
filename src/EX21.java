
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX21 {

    public static void main(String[] args) {


      //  System.out.println("please enter the count:");

        int N = StdIn.readInt();

        String[] name = new String[N];
        int[] score1 = new int[N];
        int[] score2 = new int[N];


        for(int i = 0; i < N; i ++){
            name[i] = StdIn.readString();
            score1[i] = StdIn.readInt();
            score2[i] = StdIn.readInt();

        }

        for(int i = 0; i < N; i ++){
          //  StdOut.println(i+" "+ name[i] +" "+ score1[i] +" "+ score2[i] +" "+ score3[i]);
            System.out.printf("|%d |%4s |%4d |%4d |%7.3f |\n", i, name[i], score1[i], score2[i], (float)score1[i]/score2[i]);
        }



    }

}
