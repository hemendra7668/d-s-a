import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();  // Number of nodes at current level
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();  // Get the next node in the queue
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) queue.add(currentNode.left);  // Add left child if exists
                if (currentNode.right != null) queue.add(currentNode.right);  // Add right child if exists
            }

            result.add(currentLevel);  // Add the current level to the result
        }

        return result;
    }
}
