class Circular_array {
    int data;
    int size;
    int[] arr = new int[size];
    int front = -1;
    int rear = -1;

 boolean is_empty()
 {
    if(front=-1 && rear=-1)
    {
return true;
    }
    return false;
 }

    boolean is_full() {
        front = (front + 1) % size;
        if (front == 0)// front ==0 set baad m kri h
        {
            return true;
        }
        return false;
    }

    public void enqueue(int data) {
        if (is_full()) {
            throw new IllegalStateException("CIrcular queue is full");
        } else {
            rear = 0;
            front = 0;
            rear = rear + 1;
            arr[rear] = data;

        }
        return;
    }

    public void deqeueue(int data) {
        if (is_empty()) {
            throw new IllegalStateException("CIrcular queue is empty, no value can be deleted");
        } else {

        }
    }
}