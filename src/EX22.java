import java.util.Arrays;

public class EX22 {

    public static int rank(int key, int[] a){
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int deep) {

        if(lo > hi) return  -1;
        int mid = lo +(hi - lo)/2;

        if(key > a[mid]) return rank(key, a, mid+1, hi, deep+1);
        else if(key < a[mid]) return rank(key, a, lo, mid-1, deep +1);
        else {
            System.out.printf("The deep is: %d\n", deep);
            return mid;
        }

    }

    public static void main(String[] args) {

        int[] a = {1,3,6,8,61,2,16,18,20,91};
        Arrays.sort(a);
        int pos = rank(8, a);
        if(pos < 0){
            System.out.println("Can't find");
        }
        else {
            System.out.printf("Find it! The pos is: %d \n", pos);
        }

    }

}
