public class LInked_list {
    public static void main(String[] args) {
      Node head = new Node(23);
    //  head.id=23;
      head.next=new Node(25);  
    //  head.next.id=25;
      //25 wala node k baad hum ab  node insert kr rhe h 
      head.next.next= new Node(26);
      Node temp = head.next.next;
      head.next.next= new Node(30);
      head.next.next.next=temp;
      /// from here it is similar with the defaul same values
      head.next.next.id=30;
      head.next.next.next= new Node(40);
    // System.out.println(head.id+"the next add"+head.next+"the next data"+head.next.id+"the next add"+head.next);
    }
}


class Node{
    int id;
    Node next;
    Node(int id)
    {
        this.id=id;
    }
}