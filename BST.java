import java.util.ArrayList;

public class BST {
    TreeNode root;

    public void insert(int data) {
        if (this.root == null) {
            this.root = new TreeNode(data);
            return;
        }
        TreeNode temp = this.root;
        TreeNode parent = null;
        while (true) {
            parent = temp;
            if (data < temp.data) {
                temp = temp.left;
                if (temp == null) {
                    parent.left = new TreeNode(data);
                    break;
                }
            } else {
                temp = temp.right;
                if (temp == null) {
                    parent.right = new TreeNode(data);
                    break;
                }
            }
        }

    }

    // recursive manner
    public static TreeNode inserts(TreeNode node, int data) {
        if (node == null)
            new TreeNode(data);
        if (data < node.data) {
            node.left = inserts(node.left, data);
        }
        if (data > node.data) {
            node.right = inserts(node.right, data);
        }
        return node;
    }

    // Arraylist wise
    ArrayList<TreeNode> al = new ArrayList<TreeNode>();

    public static ArrayList<TreeNode> in(TreeNode node, ArrayList<TreeNode> al) {
        if (node != null) {
            in(node.left, al);
            al.add(node);
            in(node.right, al);
            return al;
        }
        return al;
    }

    public static void main(String[] args) {

        BST t = new BST();
        t.insert(25);
        t.insert(15);
        t.insert(50);
        t.insert(10);
        t.insert(22);
        t.insert(35);
        t.insert(70);
        t.insert(4);
        // System.out.println(t.toString());
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(25);
        al.add(15);
        al.add(50);
        al.add(10);
        al.add(22);
        al.add(35);
        al.add(70);
        al.add(4);

        // System.out.println(al.toString());

    }

}
