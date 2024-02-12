

// the implememtation of Queue from the array 
class Queue{
    int size;
    int front,rear = -1;
    // Node top;
int[]ar = new int[];
// simple queue has several operations like:- peek, diplay, enqueue and dequeue.......

void isEmpty()
{
     if(front==-1 && rear ==-1 ){
        return true;
     }
  else   return false;
}

public void add_element(int data)
{
    
    if(front==-1 && rear ==-1 )
    {
front++;
rear++;
 ar[rear]=data;
    }
    else if()
    {
        System.out.println("the queue is full");
    }
    else{
       

    }
}

}
