package Arrays;

import jdk.jfr.Frequency;

import java.util.ArrayList;
import java.util.List;

//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
public class MajorityElements2 {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> majorityList = new ArrayList<>();


        if(nums.length == 2 && nums[0] != nums[1]){
            majorityList.add(nums[0]);
            majorityList.add(nums[1]);
        }


        int frequency[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            frequency[i]  = 1;// Counting Current Number
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] == nums[j] && nums[j] != -1){// Checking if two elements are same

                    frequency[i]++;

                    nums[j] = -1;// Setting number we have already found matches with to '-1'.
                }
            }
        }

//        -------------------------------------------------------------------------

//        Checking Max Frequency > n/2
        for (int i = 0; i < frequency.length; i++) {

            if(frequency[i] >= (nums.length/2) && frequency[i] != -1){
                System.out.println("Frequency "+frequency[i]+ " Element "+nums[i]);
                majorityList.add(nums[i]);
            }
        }

        return majorityList;

    }
}
