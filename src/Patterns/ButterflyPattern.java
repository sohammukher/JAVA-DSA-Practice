package Patterns;

public class ButterflyPattern {

    public static void main(String[] args) {
        int row = 4;

        // First Half Butterfly (Top)
        for (int i = 1; i <= row ; i++) {

            for (int j = 1; j <= i ; j++) { // Stars First Quadrant
                System.out.printf("*");
            }
            for (int j = 1; j <=(2*row - 2*i) ; j++) { // Spaces
                System.out.printf(" ");
            }
            for (int j = 1; j <=i ; j++) { // Stars Second Quadrant
                System.out.printf("*");
            }
            System.out.println( ); // Line Change

        }

        /////////////////////////////////////////////////////////////////////////////////

        // Second Half Butterfly (Bottom ): Just Reverse the Loop, Ulta , Recall how to.
        for (int i = row; i >=1; i--) {

            for (int j = i; j >= 1 ; j--) { // Stars First Quadrant
                System.out.printf("*");
            }
            for (int j = (2*row - 2*i); j >=1 ; j--) { // Spaces
                System.out.printf(" ");
            }
            for (int j = i; j >= 1 ; j--) { // Stars Second Quadrant
                System.out.printf("*");
            }
            System.out.println( ); // Line Change

        }





    }
}
