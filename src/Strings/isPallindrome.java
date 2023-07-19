package Strings;


public class isPallindrome {

    public static boolean isPalindrome(String s) {

        s=s.replaceAll("\\s", "");
        s= s.replaceAll(",","");
        s= s.replaceAll(":","");
        s=s.toLowerCase();


        System.out.println(s);

        // Always True For Blank Strings
        if(s == ""){
            return true;
        }

        int i = 0; // pointing to first index
        int j = s.length()-1;

        while (i<j){

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
