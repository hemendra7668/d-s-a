
// the implememtation of Queue from the array 
class Queue {
    int size;
    int front, rear = -1;
    // Node top;
    int[] ar = new int[5];
    // simple queue has several operations like:- peek, diplay, enqueue and
    // dequeue.......

    boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else
            return false;
    }

    public void add_element(int data) {

        if (front == -1 && rear == -1) {
            front++;
            rear++;
            ar[rear] = data;
        } else {
            System.out.println("the queue is full");
        }

    }

}
