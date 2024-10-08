package Queue_Program;



public class Queue
{
    class Node
    {
        public int data;
        public Node next;
    }

    private Node first;

    public Queue()
    {
        first = null;
    }

    public void insertFirst(int x)
    {
        Node n = new Node();
        n.data = x;
        n.next = first;
        first = n;
    }

    public void enqueue(int x)
    {
        if (first == null)
        {
            insertFirst(x);
        }
        else
        {
            Node n = new Node();
            n.data = x;
            Node temp = first;
            while (temp.next != null)
                temp = temp.next;
            n.next = temp.next;
            temp.next = n;
        }
    }

    public int dequeue()
    {
        if (first == null)
        {
            return -1;
        }
        else
        {
            int ret = first.data;
            first = first.next;
            return ret;
        }
    }

    public int peek()
    {
        if (first == null)
        {
            return -1;
        }
        else
        {
            return first.data;
        }
    }

    public static void main (String[] args)
    {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.print("First peek: " + queue.peek());

        System.out.print("\nFirst dequeue: " + queue.dequeue() + "\nSecond dequeue: " + queue.dequeue() + "\nThird dequeue: " + queue.dequeue());
    }
}