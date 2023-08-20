package Stack;

import java.util.Stack;

public class PushToBottom {
    public static void pushToBottom(int element, Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }

        Integer currentElement =  stack.pop();

        pushToBottom(element,stack);

        stack.push(currentElement);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <11 ; i++) {
            stack.push(i);
        }
        pushToBottom(888,stack);

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
