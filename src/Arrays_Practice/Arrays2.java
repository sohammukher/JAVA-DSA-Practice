package Arrays_Practice;

import java.util.Arrays;

public class Arrays2 {
    public static void atleastOneGreater(int arr[]){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            max = Integer.max(max,arr[i]);

        }

        int countOfMax = 0;

        // Find Out Count Of max
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == max){
                countOfMax++;
            }
        }

        System.out.println("Numbers having at least One Number Greater than Itself is "+(arr.length-countOfMax));
    }
    public static void main(String[] args) {

        int arr[] = {3,4,11,8,2,10,9,11};

        atleastOneGreater(arr);
    }
}
