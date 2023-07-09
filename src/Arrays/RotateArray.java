package Arrays;

public class RotateArray {

    static void reverse(int arr[], int startIndex, int endIndex){
        int temp = 0;

        while (startIndex<endIndex){
            temp= arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            // Incrementing the Pointers
            startIndex ++;
            endIndex--;

        }
    }

    public void rotate(int[] nums, int k) {


        // To handle Values Greater than arr.length
        k = k % nums.length;

        // -ve Values
        if(k < 0){
            k = k + nums.length;
        }

        // Now Main Steps

//        Step 1: Reverse First Half
        reverse(nums, 0 , nums.length - k - 1);

//        Step 2: Reverse Second Half
        reverse(nums, nums.length-k, nums.length-1);

//        Step 3 : Reverse Whole
        reverse(nums, 0 , nums.length-1);

    }


    public static void main(String[] args) {


    }
}
