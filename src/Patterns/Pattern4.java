package Patterns;

public class Pattern4 {



    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) { // Loop 1 : Rows
            for (int j = 1; j <= (rows - i); j++) { // Loop 2 : Spaces
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) { // Loop 3 : Stars
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
