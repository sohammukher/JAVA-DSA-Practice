package Recursion;

public class PrintDec {

    public static void printDec(int num){

        if(num == 0){
            return;
        }
        System.out.println(num);

        printDec(num-1);

    }
    public static void main(String[] args) {
        printDec(10);
    }
}
