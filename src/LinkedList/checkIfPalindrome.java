package LinkedList;


public class checkIfPalindrome {

    // Function to find Middle
   LinkedList.Node findMiddle(LinkedList.Node head){

       LinkedList.Node slow = head;
       LinkedList.Node fast = head;

       // fast != null is for odd case
       // fast. next != null is for  even case
       // If any of them become false stop
       while(fast != null  && fast.next != null){
           slow = slow.next; // +1
           fast = fast.next.next; // +2
       }

       return slow; // slow is the middle node

   }
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
    }
}
