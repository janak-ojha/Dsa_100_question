package Stack;

public class Stack_using_Arrray {
    
    private int[] stackArray; // array to store stacked element
    private int top;  //pointer on top of stack
    private int capacity; //capacity of the stack 

   //Constructor to insitialize the stack
    public Stack_using_Arrray(int size){
        stackArray = new int[size];
        capacity = size;
        top = -1; // stack is intitially empty
    }

    //pushing
    public void push(int value)
    {
        if(isfull())
        {
            System.out.println("stack is overflow . stack is full");
            return ;
        }
        top++;
        stackArray[top] = value;
    }

    // poping pr deleting

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack is  underflow . stack is emoty");
            return -1;
        }
        top--;
        return stackArray[top];
    }

    //peek to get top value without removing value.

    public int peek()
    {
        if(! (isEmpty()))
        {
            return stackArray[top];

        }
        else{
            System.out.println("stack is empty");
            return -1;
        }
    }

    // to get size
    public int size()
    {
        return top+1;
    }

    //check is empty
    public boolean isEmpty(){
        return top == -1;

    }
    
    //check is full
    public boolean isfull()
    {
        return top == capacity -1;
    }

    //printstack
    public void print()
    {
        if(isEmpty())
        {
            System.out.println("isempty");
        }

        for(int i=0;i<=top;i++)
        {
            System.out.print(stackArray[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack_using_Arrray stack = new Stack_using_Arrray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);

        System.out.println("top element is " + stack.peek());
        System.out.println("the size is :" + stack.size() );
        System.out.println(stack.pop());

        
    }
    
}
