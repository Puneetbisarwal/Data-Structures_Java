package Queue_Program;


public class Queue_Using_Array {

    int front,rear;
    int SIZE = 6;

    int arr[] = new int[SIZE];

    Queue_Using_Array()
    {
        front = -1;
        rear = -1;
    }

    boolean isFull()
    {
        if(front == 0 && rear == SIZE-1)
        {
            return true;
        }
        return false;
    }

    boolean isEmpty()
    {
        if(front == -1)
        {
            return true;
        }
        return false;
    }

    void enqueue(int element)
    {
        if(isFull())
        {
            System.out.println("Queue is Full\n");
        }


        else
        {
            if(front == -1 && rear ==-1)
            {
                front = 0;
                rear = 0;
            }

            rear++;
            arr[rear] = element;
            System.out.println("Inserted-> " + element);
        }

    }


    int dequeue()
    {
        int element;
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        else
        {
            element = arr[front];
            if(front==rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                front++;
            }

            System.out.println("Deleted-> " + element);
            return element;
        }
    }

    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty\n");
            return -1;
        }
        return arr[front];
    }

    void printQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty ");
        }
        else
        {
            System.out.print("Elements-> ");
            for(int i=front;i<=rear;i++)
                System.out.print(" " + arr[i]);

            System.out.println("\n Front index-> " + front);
            System.out.println(" Rear index-> " + rear);
        }
    }

    public static void main(String[] args) {


        System.out.println("\n---Queue using Arrays---\n");
        Queue_Using_Array s = new Queue_Using_Array();

        s.dequeue();

        s.enqueue(25);
        s.enqueue(36);
        s.enqueue(50);
        s.enqueue(63);
        s.enqueue(78);
        s.enqueue(85);


        // 6th element can't be added to because the queue is full
        s.enqueue(96);
        s.printQueue();

        System.out.println("\n---Queue front-> " + s.peek());


        s.dequeue();
        s.printQueue();

        System.out.println("\n---Queue front-> " + s.peek());

    }
}
