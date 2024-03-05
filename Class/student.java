class Student{
    String name;
    Double cpi;
    int clss;
Student(String name,Double cpi, int clss)
{
//    @required
    this.name=name;
//    @required 
    this.cpi=cpi;
//    @required 
    this.clss=clss;

}
}

class Node{
    Student data;
Node next;
Node pre;
Node(Student data){
    this.data=data;
}
}

class Doublylist{
    Node head, tail;
   
     public void insert_first(Student data)
     {
        Node newn = new Node(data);
        if(head==null && tail == null)
        {
            head = newn;
            tail = newn;
        }
    while(head!=null)
    {
    newn.next = head;
    newn.pre = tail;
    head=newn;
    }
    tail.next=head;
     }
   
     public void delete_first()
     {
        head= head.next;
        // head.next= head;
tail.next= head;
        return ;
     }
    public Boolean delete_last()
    { return false;
    }
      public void insert_last(Student data)
     {
        Node newn = new Node(data);

     }
//      public void display(){
//         Node temp = New Node(data);
//         head= temp;
//         while(temp.next!= null)
//         {
// System.out.print(temp.data.name);
// System.out.print(temp.data.cpi);
// System.out.print(temp.data.clss);
//             temp= temp.next;

//         }
        
//      }


     public void display() {
    Node current = head;
    System.out.println("Contents of the Doubly Linked List:");
    while (current != null) {
        System.out.println("Name: " + current.data.name + ", CPI: " + current.data.cpi + ", Class: " + current.data.clss);
        current = current.next;
    }
}
      public static void main(String[]args)
    {
//    Student data = Student("hem",9.6,47);
//    Doublylist dby= new Doublylist();
//    dby.insert_first(data);
// //   dby.insert_first();
 Doublylist dby = new Doublylist();

    // Creating a new Student object
    Student student = new Student("hem", 9.6, 7);
    Student student1 = new Student("hem", 9.6, 7);

    // Inserting the student object into the doubly linked list
    dby.insert_first(student);
    dby.insert_first(student1);
    dby.display();
    }
}