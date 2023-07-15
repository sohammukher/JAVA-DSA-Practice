package Arrays;



public class PrintSubArrays {

    public static void printSubArray(int arr[]){


        int start =arr[0];
        int end = arr.length-1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {

                // Printing the Sub Array Created From
//                start to end
                start = i;
                end = j;

                // Loop only to Print Sub Arrays
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                }
                // Line change
                System.out.println();

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int arr[]  = {2,4,6,8,10};
        printSubArray(arr);
    }
}
