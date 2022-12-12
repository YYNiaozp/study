package basic.search.tree;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/22 00:13
 */
public class _226invertTree {
    public TreeNode invertTree(TreeNode root) {
        return dfs(root);
    }

    private TreeNode dfs(TreeNode root){
        if (root == null){
            return null;
        }

        TreeNode left = root.left;
        dfs(left);
        TreeNode right = root.right;
        dfs(right);
        root.left = right;
        root.right = left;
        return root;
    }
}
