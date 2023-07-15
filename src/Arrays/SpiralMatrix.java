package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> spiralSequence = new ArrayList<>();

        if(matrix[0].length ==1){
            for (int element[]:
                    matrix) {
                spiralSequence.add(element[0]);
            }
            return spiralSequence;
        }

        // For Rows
        int startRow = 0, endRow = matrix.length-1;

        // For Columns
        int startCol = 0, endCol = matrix[0].length-1;

//---------------------------------------------------------------

        while(startRow <= endRow && startCol <= endCol) {
            // Printing Top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i]+" ");
                spiralSequence.add(matrix[startRow][i]);
            }

            // Printing Right
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
                spiralSequence.add(matrix[i][endCol]);
            }

            // Printing Bottom
            for (int i = endCol -1; i >= startCol ; i--) {

                // To avoid redundancy in case of an Odd Element Remaining
                // Bottom Will Print what top has Covered

                // Always check this  for the value we are iterating
                // Here it is column
                System.out.println("BOTTOM "+startCol+" "+endCol);

                if(startRow == endRow){ // Only One Element Remaining
                    break;
                }

                System.out.print(matrix[endRow][i]+" ");
                spiralSequence.add(matrix[endRow][i]);
            }


            // Printing Left
            for (int i = endRow-1; i >= startRow+1; i--) {


                System.out.println("Left");

                // Same Like Left Logic
                if(endRow == startRow){
                    break;
                }

                System.out.print(matrix[i][startCol]+" ");
                spiralSequence.add(matrix[i][startCol]);
            }

            startRow++; startCol++;
            endRow--; endCol--;

        }
        return spiralSequence;
    }

    public static void main(String[] args) {

//        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        List<Integer> list = spiralOrder(matrix);
    }
}
