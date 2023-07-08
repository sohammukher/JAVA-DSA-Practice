package Patterns;

public class Pattern2 {


//            ****
//            *  *
//            *  *
//            ****
    public static void main(String[] args) {
        int rows =4;
        int cols =4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols ; j++) {
                if(i == 1 || i == rows || j == cols ||j == 1  ){
                    System.out.print("*");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
