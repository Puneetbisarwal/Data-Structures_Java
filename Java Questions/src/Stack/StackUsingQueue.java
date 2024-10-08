package Stack;


import java.util.LinkedList;

public class StackUsingQueue {

    public static final int MAX = 1024;
    private int arr[];
    private int top;

    StackUsingQueue <Integer> q1 = new LinkedList<Integer>();
    StackUsingQueue <Integer> q2 = new LinkedList<Integer>();


    public Boolean isEmpty()
    {
        return top == -1;
    }

    public int size()
    {
        return top+1;
    }

    public void printStack()
    {
        for(int i=0;i<=top;i++)
            System.out.print(" " + arr[i]);
    }

    //Function to push an element into stack using two queues.
    void push(int a)
    {
        // Your code here
        while(!q1.isEmpty())
        {
            q2.add(q1.remove()) ;
        }
        q1.add(a) ;
        while(!q2.isEmpty())
        {
            q1.add(q2.remove()) ;
        }
    }

    //Function to pop an element from stack using two queues.
    int pop()
    {
        // Your code here
        if(q1.isEmpty())
        {
            return -1 ;
        }
        return q1.remove() ;
    }

    public static void main(String[] args)
    {
        System.out.println("\n---Stack using Two Queues---\n\n\n");
        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }

}
