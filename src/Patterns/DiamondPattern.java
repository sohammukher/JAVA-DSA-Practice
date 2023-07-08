package Patterns;

public class DiamondPattern {
    public static void main(String[] args) {

        int rows = 4;

        // Print Top Half
        for (int i = 0; i < rows; i++) {

            for (int j = 1; j <= rows - i; j++) { // Spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2 + 1 ; j++) { // Stars
                System.out.print("*");
            }

            System.out.println();// New Line
        }

        // Print Bottom Half
        for (int i = rows; i >= 0; i--) {

            for (int j = 0; j < rows - i; j++) { // Spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2 + 1 ; j++) { // Stars
                System.out.print("*");
            }

            System.out.println();// New Line
        }
    }
}
