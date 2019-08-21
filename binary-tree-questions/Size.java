import java.util.*;

public class Size {
    public static int size(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return size(root.left) + size(root.right) + 1;
        }
    }

    public static void main(int args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(31);
        root.left.left.right = new TreeNode(123);
        root.right.left = new TreeNode(45);

        System.out.println("Size of tree: " + size(root));
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