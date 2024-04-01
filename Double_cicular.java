class Double_circle {

    int data;
    int size;
    int[] arr;
    int front = -1;
    int rear = -1;

    public Double_circle(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    int peek() {
        if (is_empty()) {
            System.out.println("no value in the queue");
            return 0;
        } else {

            return arr[front];
        }
    }

    void last_value() {
        if (is_empty()) {
            System.out.println("no value in the queue");

        }
        System.out.println(arr[rear]);
    }

    boolean is_empty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    public boolean is_full() {
        front = (rear + 1) % size - 1;

        return false;
    }

    public void insert_last(int data) {
        if (is_full()) {
            System.out.println("the queue is full, no value can be inserted");
            // front=0;
            // rear=0;
        } else {
            if (is_empty()) {
                front = 0;
                rear = 0;
                arr[rear] = data;
            } else {
                // rear++;
                arr[++rear] = data;
            }
        }
    }

    public int delete_last() {
        if (is_empty()) {
            System.out
                    .println("the queue is already empty, no value can be deleted from the queue" + Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        } else if (front == rear) {
            int val = arr[front];
            front = rear = -1;
            return val;
        } else {
            int val = arr[rear];
            if (rear == 0) {
                rear = arr.length - 1;
            } else {
                rear--;
            }
            return val;

        }
    }

    public boolean insert_first(int data) {
        if (is_full()) {
            return false;

        } else if (is_empty()) {
            front++;
            rear++;
            arr[front] = data;
            return true;
        }

        else {
            if (front == 0) {
                front = arr.length - 1;
            } else {
                front--;
            }
            arr[front] = data;
            return true;
        }
    }

    public int delete_first() {
        if (is_empty()) {
            return 0;
        } else if (front == rear) {
            int val = arr[front];
            front = rear = -1;
            return val;
        } else {
            int val = arr[front];
            front = (front + 1) % arr.length;
            return val;
        }
    }

    public void display() {
        if (is_empty()) {
            return;
        }
        for (int i = front; i != rear; i = (i + 1) % arr.length) {
            System.out.println(arr[i] + "--");
        }
        System.out.println(arr[rear]);
    }

    public static void main(String[] args) {
        Double_circle dc = new Double_circle(5);
        dc.insert_first(12);
        dc.insert_first(16);
        dc.insert_first(18);
        dc.insert_first(19);
        dc.insert_first(11);
        dc.insert_first(14);
        dc.insert_first(15);
        System.out.println(dc.peek());
        dc.display();
    }

}