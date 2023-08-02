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


    public static void main(String[] args) {


        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.addMiddle(9,2);

        printLL();

        System.out.println("\n\n"+"Size of LL is "+ll.size);
    }
}
