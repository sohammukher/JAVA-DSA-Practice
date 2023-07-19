package Recursion;

public class Fibonacci {

    public static void fiboLoop(int num){

        int i = 0;
        int j = 1;

        System.out.print(i+" ");
        System.out.print(j+" ");


        for (int k = 0; k < 10; k++) {

            int fibo = i + j;

            System.out.print(fibo+" ");

            i = j;

            j = fibo;



        }
    }


    public static int  fibonaciReccur(int num ){

        if(num == 0 || num ==1){
//            System.out.println(num+" ");

            return num;
        }

        int fib1= fibonaciReccur(num-1);
        int fib2= fibonaciReccur(num-2);

//        System.out.println((fib1+fib2)+" ");

        return fib1+fib2;


    }
    public static void main(String[] args) {
        System.out.println(fibonaciReccur(23));
    }
}
