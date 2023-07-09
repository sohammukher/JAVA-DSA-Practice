package Arrays;

import java.util.Arrays;

public class ReverseArray {

    static void reverse(int arr[]){

        int i = 0;

        int j = arr.length-1;

        while(i<j){

            int temp = arr[i];

            arr[i]  = arr[j];

            arr[j] = temp;

            // Updating Pointers
            i++;
            j--;

        }

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        reverse(arr);


        System.out.println(Arrays.toString(arr));

    }
}
