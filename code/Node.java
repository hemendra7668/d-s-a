public class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
        // this.next = next;
    }
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    Node(int val, Node prev, Node next) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
