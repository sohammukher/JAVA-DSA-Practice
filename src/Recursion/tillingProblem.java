package Recursion;

public class tillingProblem {

    public static int tilling(int N){

        if(N == 0 || N == 1){
            return 1; // If the width remaining is 0, we cant put any choice --> Only 1 Choice
                        // if Only One Width Remaining we can Put only in Vertical Position only 1 Choice.
        }

        int horizontal = tilling(N-2);
        int vertical = tilling(N-1);

        int totalWays = horizontal + vertical;

        return totalWays;

    }
    public static void main(String[] args) {

        System.out.println(tilling(4));
    }
}
