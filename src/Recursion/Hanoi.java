package Recursion;

public class Hanoi {

    public static void towerOfHanoi(int N, String source, String helper, String destination){

        // Last Disk
        if(N==1){

            System.out.println(" Transfer Disk "+N+ " From "+source+" to "+destination);
            return;
        }

        // Transfer (n-1) from src to helper, using dest as helper
        towerOfHanoi(N-1,source,destination,helper);

        // Transfer one disk from src to dest
        System.out.println(" Transfer Disk "+N+ " From "+source+" to "+destination);

        // Transfer (n-1) disks from helper to dest using src as helper
        towerOfHanoi(N-1,helper,destination,source);

    }

    public static void main(String[] args) {

        int n = 2;

        towerOfHanoi(n,"S","H","D");
    }
}
