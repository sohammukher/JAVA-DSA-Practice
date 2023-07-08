package Patterns;

public class NumberTriangle {



    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i ; j++) { // Space
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) { // Print Number
                System.out.print(i+" ");
        }

            System.out.println();// New Line
    }
}
}
