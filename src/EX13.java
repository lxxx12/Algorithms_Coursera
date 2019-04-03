public class EX13 {
    public static void Transarr(double[][] matrix) {
        double flag1 = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[i].length; j++){
                flag1 = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = flag1;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        double[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        Transarr(a);
    }
}
