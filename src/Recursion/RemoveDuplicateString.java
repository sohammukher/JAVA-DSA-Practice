package Recursion;

public class RemoveDuplicateString {
    public static void RemoveDuplicateString(String str, int index, StringBuilder newString, boolean MAP[]){

        if(index == str.length()){ // Reached End Of String
            System.out.println(newString);
            return;
        }

        // Search in the MAP

        // Element Has Occurred Previously, Hence Just make a Function call
        if( MAP[str.charAt(index) - 'a']  == true){
            RemoveDuplicateString(str,index+1,newString,MAP);
        }
        else{ // Not Present in MAP Unique Element

            // Set Value to True inside MAP
            MAP[str.charAt(index) - 'a']  = true;

            // Append to newStr
            newString.append(str.charAt(index));

            // Make Function Call for next Characters
            RemoveDuplicateString(str,index+1,newString,MAP);

        }


    }

    public static void main(String[] args) {



        String str = "mmmmaaaahhssswnnnntttssdsdsadasdadlkkl";

        StringBuilder newStr = new StringBuilder("");


        boolean MAP[] = new boolean[26]; // One for each Alphabet


        RemoveDuplicateString(str, 0,  newStr, MAP);



    }
}
