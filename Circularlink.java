class Circularlink{
Node head;
Node tail;

   void addlast(int data)
   {
    if(head==null)
    {
    Node head = new Node(data);
    head.next=head;
        return;
    }
     else{
        Node temp = head;
        while (temp.next!=head) {
            temp= temp.next;
        }
        temp.next= head;
        }
   }

   public void display()
   {
    Node temp= head;
    while(temp!=head)
    {
        System.out.println(temp.data);
        temp=temp.next;

    }
   }
    public static void main(String[]args)
    {
        // Node head= new Node();
        // Node temp = new Node();
Circularlink cl = new Circularlink();
       
cl.addlast(25);
cl.addlast(29);
cl.display();
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
    this.data=data;
    }
}