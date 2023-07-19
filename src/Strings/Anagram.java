package Strings;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s, String t) {

        // length not same
        if(s.length() != t.length()){

            return false;
        }


        char str[] =  s.toCharArray();
        char str1[] =  t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(str1);

        for (int i = 0; i < str.length; i++) {
            if(str[i] != str1[i]){
                return false;
            }
        }


        return true;
    }
    public static void main(String[] args) {

    }
}
