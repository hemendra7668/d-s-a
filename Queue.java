
// the implememtation of Queue from the array 
class Queue {
    int size;
    int front = -1, rear = -1;
    // Node top;
    int[] ar = new int[size];
    // simple queue has several operations like:- peek, diplay, enqueue and
    // dequeue.......

    public Queue(int size) {
        this.size = size;
        this.ar = ar;
    }

    boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else
            return false;
    }

    boolean isfull() {
        if (front == -1 && rear == 4) {
            return true;
        } else
            return false;
    }

    public void add_element(int data) {

        if (isEmpty()) {
            front++;
            rear++;
            ar[rear] = data;
        } else {
            System.out.println("the queue is full");
        }

    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty, no value can be deleted.");
        } else {
            front++;
            ar[front] = 0;
            for (int i = front; i < rear; i++) {

                ar[front] = ar[front + 1];
            }
            rear--;

        }

    }

    public void display() {
        front++;
        for (int i = front; i < rear; i++) {

            ar[front] = ar[front + 1];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add_element(5);
        q.add_element(57);
        q.add_element(1);
        q.dequeue();
        q.display();
    }

}
