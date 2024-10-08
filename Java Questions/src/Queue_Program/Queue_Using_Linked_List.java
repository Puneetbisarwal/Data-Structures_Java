package Queue_Program;


class Node
{
    int data;
    Node next;
}

class QueueLinked
{
    Node first;
    Node last;
    int size;

    public Node getNewNode(int element)
    {
        Node q = new Node();
        q.data = element;
        q.next = null;
        return q;
    }

    public boolean isEmpty()
    {
        if(first ==null && last == null)
        {
            return true;
        }

        return false;
    }

    public int getSize()
    {
        return size;
    }


    public void enqueue_Linked_List(int element)
    {

        if(first == null && last == null)
        {
            first = last = getNewNode(element);
            size++;
            return;
        }
        size++;
        last.next = getNewNode(element);
        last = last.next;

    }

    public int dequeue_Linked_List()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty ");
            return Integer.MIN_VALUE;
        }
        size--;
        int t = first.data;
        first = first.next;

        if(first == null)
        {
            last = null;
        }
        return t;
    }

    public void peek_Linked_List()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty ");
            return ;
        }
        else
        {
            System.out.println(" " + first.data);
        }
    }

    public void Rear()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty ");
            return ;
        }
        else
        {
            System.out.println(" " + last.data);
        }
    }

    public void printQueue_Linked_List()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty ");
            return ;
        }
        Node temp = first;
        while (temp != null)
        {
            System.out.println(" " + temp.data);
            temp = temp.next;
        }

    }
}



public class Queue_Using_Linked_List {

    public static void main(String[] args)
    {

        System.out.println("\n---Queue using Linked List---\n");
        QueueLinked s = new QueueLinked();

        s.dequeue_Linked_List();

        s.enqueue_Linked_List(15);
        s.enqueue_Linked_List(26);
        s.enqueue_Linked_List(30);
        s.enqueue_Linked_List(43);
        s.enqueue_Linked_List(58);
        s.enqueue_Linked_List(65);


        // 6th element can't be added to because the queue is full
        s.enqueue_Linked_List(76);
        s.printQueue_Linked_List();


        System.out.println( "\n---Queue front-> ");
        s.peek_Linked_List();


        s.dequeue_Linked_List();
        s.printQueue_Linked_List();


        System.out.print("\n---Queue Front-> " );
        s.peek_Linked_List();

        System.out.println("Size: " + s.getSize());
        System.out.print("Front: ");
        s.peek_Linked_List();
        System.out.print("Rear: ");
        s.Rear();
    }
}
