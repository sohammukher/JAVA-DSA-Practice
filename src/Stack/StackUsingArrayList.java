package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {

    public static ArrayList<Integer> list = new ArrayList<>();


    public static boolean isEmpty(){
        return list.size() == 0;
    }
    public static void push(int data){
        list.add(data);
    }

    public static int pop(){
        int top = list.remove(list.size()-1);
        return top;
    }

    public static void main(String[] args) {
        StackUsingArrayList stack = new StackUsingArrayList();

        for (int i = 0; i < 11; i++) {
            push(i);
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(pop());
        }
    }
}
