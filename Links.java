public class Links {
    public static void main(String[]args)
    {
        Links l = new Links();
        
        // l.add(20);
        // l.add(25);
        // l.add(26);
        // l.add(30);
        l.add_last(55);
        l.add_last(25);
        l.add_last(52);
        l.print_val();
        // System.out.println(l.search(25));
        // System.out.println(l.search_with_ind(25));
l.midnode();
    }
    Node head, tail;
    public void  add(int data)
    {
        if(head == null)
        {
            head= new Node(data);
            // tail= head;
            return;
        }
        else{
        Node temp = head;
        while (temp.next!=null) {
            temp= temp.next;
        }
        temp.next= new Node(data);
        }
    }
    void reverse()  //p=n
    {               //c=h
                    //n =null
        Node pre= null;
        Node cur = head;
        Node nxt = null;
        while(cur!= null)
        {
            nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt;
        }
        head = pre;
    }

    void add_last(int data)
    {
if(head == null && tail == null)
        {
            head = new Node(data);
           tail= head;
        }
        else{
       Node p = new Node(data);
       tail.next= p;
       tail=p;
        }
    }
    void print_val()
    {
        Node temp= head;
        while(temp!=null)
        {
           System.out.println(temp.data);
           temp= temp.next;
        }   
    }
    void frst(int data)
    {
        if(head== null)
        {

            head= new Node(data);
          
        }
        else{
            Node p = new Node(data);
              p.next= head;
            head =p;
        }
    }

    void delete_ele()
    {
        if(head == null)
        {
           System.out.println("no element can  be deleted");
        }
        else{
        Node temp = head;
        while (temp.next!=null) {
            temp= temp.next;
        }
        temp.next= null;
        }
    }
//       boolean search(int data)
//       {
//         Node temp= head;
//         while(temp!=null)
//         {
//             if(temp.data==data) return true;
//             temp = temp.next;
//         }
// return false;
//       }
  int search_with_ind(int data)
      {
        int index=0;
        Node temp= head;
        while(temp!=null)
        {
            if(temp.data==data) return index;
            ++index;
            temp = temp.next;
        }
return -1;
      }

// void insert_at_ind(int index)
// {
// if(index==0 && head != null)
// {
//     Node p= new Node(data);
//     p.next= head;
//     head=p;

// }
//     Node temp=head;
//     for(int i =1;i<temp.next;i++)
//     {
//         temp= temp.next;
//     }
// }

public void midnode()
{
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null)
    {
slow.next=head;
fast=fast.next.next;
    }
    System.out.println(slow.data);
}

}


class Node{
    int data;
 Node next;
 Node(int data){
    this.data= data;
 }
}