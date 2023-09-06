package Arrays;

public class MaxProductSubArray {
    public static int maxProduct(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;

        int currentProduct = 1;

        for (int i = 0; i < nums.length; i++) {

            currentProduct = 1;
            for (int j = i; j < nums.length; j++) {

                currentProduct *= nums[j];

                maxProduct = Integer.max(currentProduct,maxProduct);

                System.out.println("current "+currentProduct+" max "+maxProduct);
            }
        }

        return maxProduct;
    }
    public static void main(String[] args) {


        int arr[] = {2,3,-2,4};
        maxProduct(arr);
    }
}
