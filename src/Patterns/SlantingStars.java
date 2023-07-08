package Patterns;

public class SlantingStars {


    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = rows - i; j >= 1; j--) { // Print Space
                System.out.print(" ");
            }

            for (int j = 1; j <= rows ; j++) {// Print Stars
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}
