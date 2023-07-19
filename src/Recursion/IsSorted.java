package Recursion;

public class IsSorted {

     public static boolean isSorted(int arr[],int i){

         if(i == arr.length-1){
             System.out.println("The Array is Sorted");

             return true;
         }

         // Previous Greater than Next
         if(arr[i] > arr[i+1]){
             // Not Sorted Array
             return false;
         }



         return isSorted(arr,i+1);

     }
    public static void main(String[] args) {

//         int arr[] = {1,2,3,4,5,6};

        int arr[] = {1,2,3,4,5,1};

        System.out.println(isSorted(arr,0));
    }
}
