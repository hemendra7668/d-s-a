// import javax.swing.tree.TreeNode;

public class Treeinsert {
    public static TreeNode insert(TreeNode node, int data) {
        if (node == null)
            return new TreeNode(data);
        if (data < node.data) {
            node.left = insert(node.left, data);
            return node;
        }
        if (data > node.data) {
            node.right = insert(node.right, data);
            return node;
        }
        return node;
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int data;

    TreeNode(int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}