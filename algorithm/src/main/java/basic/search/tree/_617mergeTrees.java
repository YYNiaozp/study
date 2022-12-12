package basic.search.tree;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/21 22:16
 */
public class _617mergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return dfs(root1, root2);
    }

    /**
     * O(min(m,n)), O(min(m,n))
     */
    public TreeNode dfs(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = dfs(t1.left, t2.left);
        merged.right = dfs(t1.right, t2.right);
        return merged;
    }
}
