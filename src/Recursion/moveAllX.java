package Recursion;


public class moveAllX {

    public static void moveAllX(String str,int Index, int countOfX, StringBuilder newStr){

        if(Index == str.length()){

            for (int i = 1; i <= countOfX; i++) {
                newStr.append('x');
            }
            System.out.println(newStr);
            return;
        }

        if(str.charAt(Index) == 'x'){
            countOfX++;
            moveAllX(str,Index+1, countOfX, newStr);
        }
        else{
            newStr.append(str.charAt(Index));
            moveAllX(str,Index+1, countOfX, newStr);

        }

    }

    public static void main(String[] args) {
        String str = "xxxxdsadasxxxdsdsxdsdsxrwqrrrrrxdd";

        StringBuilder newStr = new StringBuilder("");

        moveAllX(str,0, 0, newStr);

    }
}
