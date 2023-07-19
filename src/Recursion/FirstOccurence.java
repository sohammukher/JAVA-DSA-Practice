package Recursion;

public class FirstOccurence {

    public static  int firstOccurance(int arr[], int target, int index){
        if(index >= arr.length){
            System.out.println("Not Found !!");
            return -1;
        }

        if(arr[index] == target){
            System.out.println("Found At Index "+index);
            return index;
        }
        else{
            return firstOccurance(arr,target,index+1);
        }


    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        System.out.println(firstOccurance(arr,5, 0));


    }
}
