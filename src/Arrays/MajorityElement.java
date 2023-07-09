package Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {

        int majorityElement = nums[0];
        int frequency[] = new int[nums.length];


        // Take Frequency of each element
        for (int i = 0; i < nums.length; i++) {

            frequency[i] = 1;// Counting Current Element

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j] && nums[i] != -1) { // Never Consider -1 while taking frequency

                    frequency[i]++; // Adding to Frequency

                    // making Current Position -1.
                    nums[j] = -1;
                }
            }
        }

//        ----------------------------------------------------------------------------


        // Taking Element With the Maximum Frequency.
        int maxFrequency = 0, maxFreqNumber = -1;

        for (int j = 0; j < frequency.length; j++) {

            if (nums[j] != -1) {
                System.out.println("Element " + nums[j] + " Frequency " + frequency[j]);

                if (maxFrequency < frequency[j]) {

                    maxFrequency = frequency[j];
                    maxFreqNumber = nums[j];

                    System.out.println("Resetting "+maxFrequency);
                    System.out.println("Number "+maxFreqNumber);
                }
            }


        }
        return maxFreqNumber;
    }


    public static void main(String[] args) {

        int arr[] = {6,5,5};
        System.out.println(majorityElement(arr));


    }
}
