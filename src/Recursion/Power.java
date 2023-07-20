package Recursion;

public class Power {


    public static int powerOptimise(int number, int power){

        if(power == 1){
            return number;
        }

        int halfPower = powerOptimise(number, power/2);

        int result = halfPower * halfPower;

        System.out.println("RESULT "+result);


        // if the Power is an Odd number
        if(power  % 2 != 0){
            result = number * result;
            System.out.println(" Odd Power");
        }

        return result;

    }
    public static void main(String[] args) {

        System.out.println(powerOptimise(2, 3));
    }
}
