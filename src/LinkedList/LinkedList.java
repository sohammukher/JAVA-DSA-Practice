package LinkedList;

public class LinkedList {

    static int size = 0;
    public static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }

    // Head and tail define
    public static Node head = null;
    public static Node tail = null;

    public static void addFirst(int data){

        Node newNode = new Node(data);

        if(head == null){
            tail = head = newNode;
            System.out.println(" Added "+data);
            // Increasing size of LL:
            size++;
            return;
        }

        newNode.next = head;

        head = newNode;

        System.out.println(" Added "+data);

        // Increasing size of LL:
        size++;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        // Empty List
        if(head == null){
            head=tail = newNode;
            System.out.println(" Added "+data);

            // Increasing size of LL:
            size++;

            return;
        }

        tail.next = newNode;
        tail = newNode;
        System.out.println(" Added "+data);

        // Increasing size of LL:
        size++;

    }

    public static void printLL(){

        System.out.println("\n\nPrinting List");

        if(head == null){
            return;
        }

        Node currentNode = head;

        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public static void addMiddle(int data, int index){

        if(index == 0){
           addFirst(data);
        }
        Node newNode = new Node(data);

        Node temp = head;

        int i = 0;

        while (i<index-1){
            temp = temp.next;
            i++;
        }

        //i = index - 1; temp( previous )

        newNode.next = temp.next;
        temp.next = newNode;


        System.out.println("Added Successfully");

        // Increasing size of LL:
        size++;

    }


    public static Node findMiddle(Node head){
        Node slow  = head;

        Node  fast = head;

        while(fast!= null && fast.next != null){ // remember this condition

            slow = slow.next;
            fast= fast.next.next;
        }

        return slow;
    }

    public static boolean checkPalindrome(Node head){

        // Check if Linked List is Empty or just having one Node
        if(head == null || head.next == null){
            return true; // this case is always palindrome
        }

        // find middle element
        Node middle = findMiddle(head);

        // Reverse from Middle
//        3 Variables
        Node prev = null;
        Node curr = middle; // Reverse from Middle
        Node next = null;

        while(curr != null){
            // Store val of next node for future reference.
            next = curr.next;

            // Actual Reverse Step
            curr.next = prev;

            // Increment
            prev = curr;
            curr = next;

        }

        Node rightHead = prev;
        Node leftHead = head;

        // Check the Left and Right Sides
        while (rightHead != null ){// At the middle right's prev points to null
            System.out.println(rightHead.data +" "+leftHead.data);
            if(rightHead.data != leftHead.data){
                return false;
            }
            // increment
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }
        return true;
    }

    // Find in LL
     public static int findInLL(Node head, int X){
        // Not Found Base Case
        if(head == null){
            return -1;
        }

        int foundAfterCurrent =  findInLL(head.next,X);
        if(foundAfterCurrent == -1){
            return -1;
        }
        else if(head.data == X){
            System.out.println("Value Found ");
            return 0;
        }else{
            System.out.println("Found at Index");
            return foundAfterCurrent+1;
        }

     }

     public static void removeFromMiddle(Node head, int pos){

        Node prev = null;
        Node current = head;

        int i = 0;

        while (i < pos){
            prev= current;
            current=current.next;
            i++;
        }

        prev.next = prev.next.next;

     }


    public static void main(String[] args) {


        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(3);



        printLL();

        System.out.println("\n\n"+"Size of LL is "+ll.size);

//        System.out.println("Palindrome Check");
//        System.out.println(checkPalindrome(head));;

        removeFromMiddle(head,3);

        printLL();

//        System.out.println(findInLL(head,3));
    }
}
