package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int toPrint = 1;
        int rows = 5;


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {

                System.out.printf(""+toPrint);

                if(toPrint == 1){
                    toPrint = 0;
                }
                else{
                    toPrint = 1;
                }

            }
            System.out.println();
        }
    }
}
