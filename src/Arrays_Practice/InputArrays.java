package Arrays_Practice;
import java.util.*;

public class InputArrays {

    public static int maxElement( int arr[]){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void reverse(int arr[]){

        int startIndex = 0;
        int endIndex = arr.length-1;

        int temp = 0;

        while (startIndex < endIndex){

            temp = arr[startIndex];

            arr[startIndex] = arr[endIndex];

            arr[endIndex] = temp;

            startIndex++;
            endIndex--;

        }
    }

//    public static rotation()
    public int[] twoSum(int[] nums, int target) {

        // Sort the Array
        Arrays.sort(nums);
        int result[] = new int[2];

        int i = 0;
        int j = nums.length-1;

        while(i<j){

            if(nums[i]+nums[j] == target){

                result[0]= i;
                result[1] = j;

                return result;
            }
            else if(target < nums[i]+nums[j]){
                i++;
            }
            else{
                j--;
            }

        }

        return new int[]{0,0};

    }



    public static void main(String[] args) {
//
//        int arr[] = new int[5];
//
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Maximum Number is "+ maxElement(arr));
//
//        System.out.println("Before Reverse ");
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        reverse(arr);
//
//        System.out.println("After Reverse ");
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        int arr[] = {1,2,3,4,5,6,7};
    }
}
