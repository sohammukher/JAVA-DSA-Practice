package Strings;

public class StringCompression {
    public static int compress(char[] chars) {

        StringBuilder compressedString  = new StringBuilder("");


        int count = 0;

        for (int i = 0; i < chars.length; i++) {

            count = 0;
            while (i< chars.length && chars[i] == chars[i+1]){
                System.out.println(" Match Found "+chars[i]+" "+chars[i+1]);

                count++; // Increasing Count for Each Match
                i++;
            }

            // Adding Character To Result
            compressedString.append(chars[i]);

            // Adding Frequency to the Compressed String
            if(count > 1){
                // Count Of element
                compressedString.append(count);
            }

        }

        System.out.println("Compressed String is "+compressedString);

        // Copying to Array:
        for (int i = 0; i < compressedString.length(); i++) {
            chars[i] = compressedString.charAt(i);
        }


        return compressedString.length();

    }

    public static void main(String[] args) {

        char arr[] = {'a','a','b','b','c','c','c'};
        System.out.println(compress(arr));
    }
}
