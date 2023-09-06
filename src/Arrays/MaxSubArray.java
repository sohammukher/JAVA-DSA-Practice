package Arrays;

public class MaxSubArray {

    public int maxSubArrayOptimised(int[] arr) {

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i]; // add current element to overall sum

            maxi = Integer.max(sum,maxi); // find max between current sum and previous maxi value

            if(sum < 0){ // if sum < 0 make sum = 0
                sum = 0;
            }
        }
        return maxi;
    }

        public static void main(String[] args) {

        int arr[] = {-2,-1};

        maxSubArray(arr);
    }



    private static void maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) { // Scanning the whole array
            int sum = 0;

            for (int j = i; j < arr.length; j++) { // Scanning subsequent elements
                sum += arr[j];
                System.out.println("sum "+sum);

                if(sum > max){
                    max = sum;
                    System.out.println("MAX "+max);
                }
            }
        }
        System.out.println("ANS "+max);
    }




}
