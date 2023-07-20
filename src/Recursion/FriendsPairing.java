package Recursion;

public class FriendsPairing {

    public static int pairFriends(int n){

//        BC: If Only One Person Remaining Only 1 way--> Stand Alone
        if(n == 1 ){
            return 1;
        }

//        BC 2: If 2 persons, 2 Ways Either Together or Single - Single
        if(n == 2){
            return 2;
        }


        // Actual Work


        // If Current Person Stands Single then Tal People remaining will be (n-1)
        int singleCurrent = pairFriends(n-1);


        // If Current Person Decides to form a pair them
        int pairCurrent = (n-1) // (n-1) people that current person has options of pairing with
                *  pairFriends(n-2); // After Forming Current Pair, People Remaining to Form a Pair

        // Total Number of Ways is the Addition of Above 2:

        int totalWays= pairCurrent + singleCurrent;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(pairFriends(3));
    }
}
