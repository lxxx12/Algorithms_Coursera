public class EX15 {
    public static void histogram(int[] a, int M) {
        int[] arr = new int[M];
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] < M) arr[a[i]]++;
        }

        for(int j = 0; j < arr.length; j++){
            System.out.print(j+" ");
            System.out.println(arr[j]);
            sum = sum + arr[j];
        }
        System.out.println();
        System.out.println(sum);



    }

    public static void main(String[] args) {
        int[] a = {1,2,5,2,2,2,2,3,1,5,1,8,5,9,9,9,};
        int M = 10;
        System.out.println(a.length);
        System.out.println();
        histogram(a,M);
    }
}
