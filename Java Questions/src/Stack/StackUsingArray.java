package Stack;

import java.util.Optional;
import java.util.Scanner;
import java.util.Stack;

public class StackUsingArray {

    public static final int MAX = 1024;
    private int arr[];
    private int top;
    private int capacity;

    // Creating a stack
    StackUsingArray ()
    {
        arr = new int[MAX];
        top = -1;
    }

    // Add elements into stack
    public void push(int element)
    {
        if(isfull())
        {
            System.out.println("Stack OverFlow\n");
            System.exit(1);
        }
        else
        {
            arr[++top] = element;
            System.out.println(element + " pushed into stack");
        }

    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty\n");
            System.exit(1);
        }

            return arr[top--];

    }

    public int peek()
    {

        if(isEmpty())
        {
            System.out.println("Stack is Empty\n");
            System.exit(1);
        }

            return arr[top];

    }

    // Check if the stack is full
    public Boolean isfull()
    {
        return top == (MAX-1);
    }

    // Check if the stack is empty
    public Boolean isEmpty()
    {
        return top == -1;
    }

    // Utility function to return the size of the stack
    public int size()
    {
        return top+1;
    }

    // Printing a stack
    public void printStack()
    {
        for(int i=0;i<=top;i++)
            System.out.print(" " + arr[i]);
    }

    public static void main(String[] args) {


        System.out.println("\n---Stack using Arrays---\n\n\n");
        StackUsingArray s = new StackUsingArray();
        s.push(4);
        s.push(6);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(60);

        System.out.println(s.pop() + " Element Popped from stack");
        System.out.println("Top element is : " + s.peek());
        System.out.print("Elements present in stack :");
        s.printStack();
        System.out.println("\nSize of stack elements : " + s.size());


    }

}
