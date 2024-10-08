    package Linked_List_Program;

// Displaying Linked list using hard code. 19th Aug 2023

    public class Linked_List {
        public static class Node
        {
            int data; //value
            Node next; // address of next node
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void printList(Node head)
        {
            while (head != null)
            {
                System.out.print(head.data+" ");
                head = head.next;
            }
        }

        public static void printListrec(Node head) //Print with the help of recursion
        {
            if (head==null)
                return;
            System.out.print(head.data+" ");
            printListrec(head.next);
        }

        public static void printListreverserec(Node head) //Print with the help of recursion with reverse
        {
            if (head==null)
                return;
            printListreverserec(head.next);
            System.out.print(head.data+" ");
        }

        public static int lengthlist(Node head) //print length of Linked List
        {
            int count = 0;
            while(head != null)
            {
                count++;
                head=head.next;
            }
            return count;
        }

        public static int recursionlengthlist(Node head) //print length of Linked List using recursion
        {
            if (head == null)
                return 0;
            return 1 + recursionlengthlist(head.next);
        }

        public static void main (String[] args) {

            Node a = new Node(5);
            Node b = new Node(13);
            Node c = new Node(49);
            Node d = new Node(89);
            Node e = new Node(200);
            Node f = new Node(345);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            //f.next = null;
            printList(a);
            System.out.println();

            printListrec(a);
            System.out.println();

            printListreverserec(a);
            System.out.println();

            System.out.println("Length of Linked List = "+lengthlist(a));
            System.out.println("Length of Linked List using Recursion = "+recursionlengthlist(a));
        }
    }
