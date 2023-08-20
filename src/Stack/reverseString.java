package Stack;

import java.util.Stack;

public class reverseString {

    public static String reverseString(String str){

        Stack<Character> stack = new Stack<>();
        String result = "";

        // Put ALl Values inside a stack
        int i = 0;
        System.out.println("Initialised");


        while (i<= str.length()-1){
            stack.push(str.charAt(i));
            i++;
        }

        System.out.println("Popping From Stack");

        //pop one by one and put in new string
        while (!stack.isEmpty()){
            result+=stack.pop();
            System.out.println(result);
        }
        System.out.println("Successfully reversed "+result);
        return result;
    }
    public static void main(String[] args) {

        System.out.println(reverseString("SOHAM"));

    }
}
