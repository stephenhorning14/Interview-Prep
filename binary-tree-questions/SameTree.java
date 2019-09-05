/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p.left == null && q == null) return true;
        boolean isLeftSame = isSameTree(p.left, q.left);
        boolean isRightSame = isSameTree(p.right, q.right);
        return p.val == q.val && isLeftSame && isRightSame;
    }
    public static void main(String[] args) {
        
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {
    }

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}