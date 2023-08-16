package LinkedList;

public class DoublelyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        // add First node

    }
    public static Node head = null;
    public static Node tail = null;

    public static int size = 0;

    public  void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            System.out.println("This is the First Node "+data);
            head = tail  = newNode;
            return;
        }

        // Connecting on the first Position
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void reverseDLL(){

        if(head == null){
            return;
        }

        Node next = null;
        Node previous = null;
        Node current = head;

        while (current != null){
            // Store
            next = current.next;

            // Actual Work
            current.next = previous;

            current.prev = next;

            // Increment
            previous = current;
            current = next;
        }

        // Don't Forget
        head = previous;

    }


    public static void main(String[] args) {
        DoublelyLL dl = new DoublelyLL();

        int toInsert = 10;

        for (int i = 0; i < 11; i++) {
            dl.addFirst(toInsert--);
        }

        printDll();

        reverseDLL();

        System.out.println("After Reversing");

        printDll();


    }

    private static void printDll() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}
