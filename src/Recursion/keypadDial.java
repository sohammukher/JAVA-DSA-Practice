package Recursion;

public class keypadDial {

    public static void keypadDial(String str, int index, String Keypad[], String result){

        if(index == str.length()){
            System.out.println(result);
            return;
        }

        // Find Corresponding Characters for Given number
        int keypadNumber = str.charAt(index) -'0';
        String mapping = Keypad[keypadNumber];

        // make function calls for all possible combinations
        for (int i = 0; i < mapping.length(); i++) {
            keypadDial(str,index+1,Keypad,result+" "+mapping.charAt(i));
        }

    }
    public static void main(String[] args) {

        String keypad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        String str = "23";

        keypadDial(str,0,keypad,"");
    }
}
