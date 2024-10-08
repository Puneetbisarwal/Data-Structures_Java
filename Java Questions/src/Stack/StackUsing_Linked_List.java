package Stack;

import Linked_List_Program.Linked_List;

import java.util.stream.StreamSupport;

public class StackUsing_Linked_List {

    Node root = null;
    public static class Node
    {
        int data;
        Node next;

        Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void push_LL(int data)
    {
        Node newNode = new Node(data);

        if(root==null)
        {
            root = newNode;
        }
        else
        {
            Node temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop_LL()
    {
        int temp = Integer.MIN_VALUE;

        if(isEmpty_LL())
        {
            System.out.println("Stack is Empty\n");
            System.exit(1);
        }
        else
        {
            temp = root.data;
            root = root.next;
        }
        return temp;
    }

    public int peek_LL()
    {

        if(isEmpty_LL())
        {
            System.out.println("Stack is Empty\n");
            System.exit(1);
        }
            return root.data;
    }

    public void printStack_LL()
    {
        Node temp = root;
        if(isEmpty_LL())
        {
            System.out.println("Stack is Empty\n");
            System.exit(1);
        }

        while (temp!=null)
        {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

    public int size_LL()
    {
        Node temp = root;
        int count = -1;
        while (temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count+1;
    }

    public Boolean isEmpty_LL()
    {
        if (root == null)
        {
            return true;
        }
        else
            return false;
    }


    public static void main(String[] args) {

        System.out.println("\n---Stack using Linked List---\n\n\n");
        StackUsing_Linked_List s = new StackUsing_Linked_List();
        s.push_LL(12);
        s.push_LL(25);
        s.push_LL(56);
        s.push_LL(70);
        s.push_LL(99);
        s.push_LL(126);
        s.push_LL(178);

        System.out.println(s.pop_LL() + " Element Popped from stack");
        System.out.println("Top element is : " + s.peek_LL());
        System.out.print("Elements present in stack :");
        s.printStack_LL();
        System.out.println("\nSize of stack elements : " + s.size_LL());
    }
}
