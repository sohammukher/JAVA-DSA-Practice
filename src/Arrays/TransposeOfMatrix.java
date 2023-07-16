package Arrays;

public class TransposeOfMatrix {
    public static int[][] transpose(int[][] matrix) {

        // Need To Flip the Rows and Columns Size
        int arr[][] = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                arr[i][j] = matrix[j][i];
            }
        }



        return arr;

    }

    public static void main(String[] args) {

    }
}
