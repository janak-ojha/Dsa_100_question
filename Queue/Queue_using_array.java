package Queue;

public class Queue_using_array {

    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;

    public Queue_using_array(int size)
    {
        queueArray = new int[size];
        capacity = size;
        front = 0;
        rear = -1; // queue is empty

    }

    public void enqueue(int value)
    {
        if(Isfull())
        {
          System.out.println("queue overflow . queue is full");  
        }
        rear++;
        queueArray[rear] = value;
    }

    public int dequeue()
    {
        if(Isempty())
        {
            System.out.println("queue is underflow . queue is empty");

        }
        int value = queueArray[front];
        front++;
        return value;
    }

    //peek
    public int peak()
    {
        if(Isempty())
        {
            System.out.println("queue underflow");
        }
        return queueArray[front];
    }

    public boolean Isfull()
    {
        return rear == capacity-1;
    }
     
    public boolean Isempty()
    {
        return rear == -1;
    }
    public static void main(String[] args) {
        
    }
    
}
