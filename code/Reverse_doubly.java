class Reverse_doubly {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        // head.next.next.next = new Node(4);
        // head.next.next.next.prev = head.next.next;

       Node tempp=  reverse(head);
       while (head!=null) {
        
           System.err.println(tempp.val);
           head= head.next;
       }
    }

    public static Node reverse(Node current) {
        if (current == null || current.next == null) {
            return current;
        }
        // Node temp = current.prev;
        Node currNode = current;
        Node prevNode = null;
        while (current!= null) {
            // current.prev = current.next;
            // current.next = temp;

            prevNode = currNode.prev;
            currNode.prev = currNode.next;
            currNode.next = prevNode;
            // temp = temp.next;
            
            current= current.prev;
        }
        current = prevNode.prev;

        return current;
    }

}