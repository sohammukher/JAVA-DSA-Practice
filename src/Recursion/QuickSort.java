package Recursion;

import java.util.Arrays;

public class QuickSort {


    public static void quickSort(int arr[], int start, int end){


        if(start >= end){
            System.out.println("Array Sorted !!!!");
            return;
        }


        //Selecting Pivot:
        int pivotIndex = partition(arr, start, end);

        // Sort Left
        quickSort(arr,start,pivotIndex-1);

        // Sort Right
        quickSort(arr,pivotIndex+1,end);

    }

    private static int partition(int[] arr, int start, int end) {

        // Selecting Last Element as Pivot Element
        int pivotElement = arr[end];
        int i = start-1;

        // Traverse from start to end and Compare
        for (int j = start; j <= end ; j++) {

            if(arr[j] < pivotElement){
                // Increment i;
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }

        // Placing the Pivot in Correct Location :
        i++;
        // Swap
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }


    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));


    }
}
