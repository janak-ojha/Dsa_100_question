package Linked_List;

// variable size(different size)
//non contiguous memory allocation
//insert in 0(1)
// search in 0(n)

public class linked_list {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // Add
    public void addFirst(String data)
    {
        Node newnode = new Node(data);
        if(head == null){
            head =newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode=currentNode.next;
            
        }
        currentNode.next = newNode;
    }

    public void delfirst()
    {
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }

    public void deletlast()
    {
        if(head == null)
        {
            System.out.println(" the list is empty");
            return;
        }
        if(head.next == null)
        {
            head=null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast= secondlast.next;
            
        } 
        secondlast.next=null;
    }

    public void del_n(int n){
        if(head == null)
        {
            System.out.println("empty");
            return;
        }
        Node curr=head;
        while (condition) {
            
        }
    }

    //print
    public void printe()
    {
        if(head == null)
        {
            System.out.println("list is empty");
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
            
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        linked_list ll = new linked_list();
        ll.addFirst("j");
        ll.addFirst("a");
        ll.printe();
        ll.addLast("a");
        ll.printe();
        ll.delfirst();
        ll.printe();
        ll.deletlast();
        ll.printe();


        
        
    }
    
}
