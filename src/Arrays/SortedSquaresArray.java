package Arrays;

import java.util.Arrays;

public class SortedSquaresArray {
    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
    public static void main(String[] args) {

    }
}
