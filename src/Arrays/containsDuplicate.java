package Arrays;


public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] == nums[j]){
                    return false;
                }
            }
        }

        return false;


    }
}