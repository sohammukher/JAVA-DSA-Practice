package Patterns;

public class NumberTriangle2 {
    public static void main(String[] args) {

        int row  = 5;


        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row-i ; j++) { // Spaces

                System.out.printf(" ");

            }

            // Print First Number in Row
            for (int j = i; j >=2 ; j--) {
                System.out.printf(j+"");
            }

            // Print Rest of the Number
            for (int j = 1; j <= i; j++) {
                System.out.printf(j+"");
            }


            System.out.println();// New Line



        }
    }
}
