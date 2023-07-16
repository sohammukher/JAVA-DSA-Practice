package Arrays;


public class searchInSortedMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int startIndexLocation = 0;

        int i = 0;
        int j = matrix[0].length-1;

        while(i <= matrix.length -1 && j>=0 ){
            startIndexLocation= matrix[0][matrix[0].length-1];

            if(startIndexLocation == target){
                // element found
                return true;
            }
            else if(target> startIndexLocation ){
                i++; // Moving to bottom
            }else{
                j--; // Moving Left
            }

        }

        return false;
    }

    public static void main(String[] args) {

    }
}
