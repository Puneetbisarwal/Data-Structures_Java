package main;

import myqueue.MyQueue;

public class MyMain
{
    public static void main(String[] args)
    {
        System.out.println("\n---Queue using Linked List---\n");
        MyQueue q = new MyQueue();
        q.enqueue(12);
        System.out.println( "\nElements at front-> " + q.peek().getData());
        q.enqueue(27);
        q.enqueue(39);
        q.enqueue(48);
        q.enqueue(52);
        q.enqueue(65);
        System.out.println("The Size of Queue is-> " + q.getSize());
        System.out.println("Element deleted from Queue-> " + q.dequeue().getData());
        System.out.println("The Size of Queue is-> " + q.getSize());

    }
}
