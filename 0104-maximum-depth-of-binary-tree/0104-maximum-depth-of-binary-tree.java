class Solution {     
    public int maxDepth(TreeNode root) {         
        if (root == null) return 0;         
        if (root.left == null && root.right == null) return 1;         
        int left = maxDepth(root.left);  // Corrected to root.left
        int right = maxDepth(root.right); // root.right remains as is         
        return Math.max(left, right) + 1;     
    } 
}
