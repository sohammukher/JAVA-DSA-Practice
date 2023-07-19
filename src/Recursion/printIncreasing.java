package Recursion;

public class printIncreasing {

    public static void printIncreasing(int num){
        if(num == 0 ){
            return;
        }

        printIncreasing(num-1);

        System.out.println(num);

    }
    public static void main(String[] args) {
        printIncreasing(10);
    }
}
