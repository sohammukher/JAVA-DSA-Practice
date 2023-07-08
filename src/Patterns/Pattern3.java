package Patterns;

//        * * * *
//        * * *
//        * *
//        *
public class Pattern3 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < (rows-i); j++) {

                System.out.printf("* ");

            }

            System.out.println("");
        }


    }
}
