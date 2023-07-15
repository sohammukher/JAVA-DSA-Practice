package Arrays;

public class TrappingRainWater {

    public int trap(int[] height) {

        int N = height.length;

//        --------------BASE CASES-----------------
        // If less than 3 bars no valley to Collect Water
        if(N < 3){
            return 0; // No water Trapped
        }
//       ------------------------------------------

        // Calculate left max boundary - AUX Array
        int leftMax[] = new int[N];
        
        // Nothing on the left of first element so 
        leftMax[0] = height[0];

        for (int i = 0; i < N; i++) {

            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // Calculate right max boundary - AUX Array
        int rightMax[] = new int[N];

        // Taking Last Element as First Element of Array
        rightMax[N -1] = height[N -1];

        // Start From the Second Last Element
        for (int i = N -2; i >= 0; i--) {
            // remember because we are going in -ve previous is
            // i+1
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        // Loop to calculate the trapped water for each bar

        int totalTrappedWater = 0;
        int widthOfBar = 1;

        int waterLevel = 0;

        for (int i = 0; i < N; i++) {

            // Calculating Water Level
            //  min (leftmax, rightmax)
            waterLevel = Math.min(leftMax[i],rightMax[i]);

            totalTrappedWater +=  (waterLevel
                                  - height[i])  // height of bar
                                    * widthOfBar ;
        }

        return totalTrappedWater;
    }

    public static void main(String[] args) {


    }
}
