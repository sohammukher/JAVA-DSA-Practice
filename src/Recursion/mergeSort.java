package Recursion;

import java.util.Arrays;

public class mergeSort {

    public static void mergeSort(int arr[], int start, int end){

        // Base Case
        if(start>=end){
            return;
        }


        int mid = (start+end)/2;

        mergeSort(arr,start,mid);// Left

        mergeSort(arr,mid+1,end);// Right


        // Merge the 2 Sorted Sub-arrays
        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        System.out.println("merge()");
        System.out.println(Arrays.toString(arr));

        int temp[] = new int[end-start+1];

        int i = start;

        int j = mid+1;

        int k =0;


        while (i <= mid && j <= end){

            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        // Copying Remaining Elements
        while (i<=mid){
            temp[k++] = arr[i++];
        }

        while (j<=end){
            temp[k++] = arr[j++];
        }

        // Copy Into Final Array
        for (int l = 0, index = start; l < temp.length; l++,index++) {
            arr[index] = temp[l];
        }
    }


    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

        mergeSort(arr,0,arr.length-1);

        System.out.println("ANSWER");

        System.out.println(Arrays.toString(arr));
    }
}
