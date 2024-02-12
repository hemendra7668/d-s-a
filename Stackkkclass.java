class Stack_link{
private Node head;

public boolean  isEmpty()
{
    return head==null;
}
public void push(int data)
{ 
Node newnode= new Node(data);
   if(isEmpty())
        {

           head = newnode;
           return ;
          
        }
      else{
       Node temp = head;
        head= newnode;
        newnode.next=temp;
       
      }
       return;
}
public int pop()
{
    if(isEmpty())
    {
        System.out.println("the stack is empty");
       return Integer.MIN_VALUE;
    }
    else{
int val = head.data;
head= head.next;
    return val;
    }
}
public void peek()
{
 System.out.println(head.data);
       
}

}



class Node
{
    int data;
    // Node prev;
    Node next;
     Node(int data)
     {
        this.data=data;
     }
}



class Implem{
  public static void main(String[]args)
    {
        Stack_link sl = new Stack_link();
        sl.push(20);
        sl.push(10);
        sl.push(80);
        sl.push(50);
        sl.push(80);
        sl.push(1000);
        sl.peek();
      int value=  sl.pop();
      System.out.println("the top value of the stack is:-"+value+"now deleted");
      sl.peek();
        System.out.println(sl.isEmpty());
        
    }
}



