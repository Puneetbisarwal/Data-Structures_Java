package myqueue;

import node.Node;
public class MyQueue
{
    private int size; // total number of elements in the queue
    private Node front;
    private Node rear;

    public boolean isEmpty()
    {
        boolean response = false;
        if(size == 0)
        {
            return true;
        }

        return response;
    }

    public void enqueue(int element)
    {
        Node temp = new Node(element);
        if(front == null)
        {
            front = temp;
            rear = temp;
            size++;
        }
        else
        {
            rear.setNext(temp);
            rear = temp;
            size++;

        }
    }

    public MyQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public Node dequeue()
    {
        Node response = null;
        if(front != null)
        {
            if(front.getNext()!= null)
            {
                response = new Node(front.getData());
                front = front.getNext();
                size--;
            }
            else
            {
                response = new Node(front.getData());
                front = null;
                rear = null;
                size--;
            }
        }
        return response;
    }

    public Node peek()
    {
        Node response = null;
        if(!isEmpty())
        {
            response = new Node(front.getData());
        }
        return response;
    }

    public int getSize()
    {
        return size;
    }
}
