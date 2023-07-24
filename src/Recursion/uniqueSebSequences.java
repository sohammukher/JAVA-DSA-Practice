package Recursion;

public class uniqueSebSequences {

    public static void uniqueSubSequences(String str, int Index, String newStr){

        if(Index == str.length()){
            // Print String Here
            System.out.println(newStr+" ");
            return;
        }

        // We have 2 Choices,

        // To Take Current Element
        uniqueSubSequences(str,Index+1,newStr+str.charAt(Index));

        // To Ignore Current Element
        uniqueSubSequences(str,Index+1,newStr);


    }

    public static void main(String[] args) {

    }
}
