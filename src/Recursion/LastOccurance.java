package Recursion;


public class LastOccurance {

    public static  int lastOccurance(int arr[], int target, int index){

        if(index < 0){
            System.out.println("Not Found !!");
            return -1;
        }

        if(arr[index] == target){
            System.out.println("Found At Index "+index);
            return index;
        }
        else{
            return lastOccurance(arr,target,index-1);
        }


    }


    public static void main(String[] args) {


        int arr[] = {1,2,3,4,5,5,2,3,1,4,5,6};
        System.out.println(lastOccurance(arr,6, arr.length-1));
    }
}
