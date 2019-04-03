public class EX11 {
    public static void BooleanPrint(boolean[][] matrix) {

        System.out.print(" ");
        for(int i = 0; i < matrix[0].length; i++)
            System.out.print(i+1);
        System.out.println();
        for(int i = 0; i < matrix.length; i++){
            System.out.print(i+1);
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] ? "*":" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] a = {{true, false, true}, {false, true, false}, {true, false, true}};
        BooleanPrint(a);
    }
}
