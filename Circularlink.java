
class Circularlink {
    Node head;
    Node tail;

    void addlast(int data) {
        if (head == null) {
            Node head = new Node(data);
            head.next = head;
            return;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != head) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        // Node head= new Node();
        // Node temp = new Node();
        Circularlink cl = new Circularlink();

        cl.addlast(25);
        cl.addlast(29);
        cl.display();
    }
}

class CreateList {
    // Represents the node of list.
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Declaring head and tail pointer as null.
    public Node head = null;
    public Node tail = null;

    // This function will add the new node at the end of the list.
    public void add(int data) {
        // Create new node
        Node newNode = new Node(data);
        // Checks if the list is empty.
        if (head == null) {
            // If list is empty, both head and tail would point to new node.
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            // tail will point to new node.
            tail.next = newNode;
            // New node will become new tail.
            tail = newNode;
            // Since, it is circular linked list tail will point to head.
            tail.next = head;
        }
    }

    // Displays all the nodes in the list
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Nodes of the circular linked list: ");
            do {
                // Prints each node by incrementing pointer.
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CreateList cl = new CreateList();
        // Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        // Displays all the nodes present in the list
        cl.display();
    }
}

// class Node {
// public Node(int data2) {
// // TODO Auto-generated constructor stub
// this.data = data;
// }

// Node next;
// int data;
// }