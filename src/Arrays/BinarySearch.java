package Arrays;

public class BinarySearch {

    public static int bSearch(int arr[], int target){

        int start = 0;
        int end = arr.length-1;



        while (start< end){

            // calculate mid
            int mid = (start+end)/2;

            System.out.println("mid "+mid);

            if(arr[mid] == target){
                return mid; // Element Found
            }

            if(arr[mid] < target){
                start = mid + 1; // Search in right sub-array
            }
            else{
                end = mid - 1; // Search in left sub-array
            }

        }
        // Element not found
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {2,5};

        System.out.println(bSearch(arr,9));



    }
}
