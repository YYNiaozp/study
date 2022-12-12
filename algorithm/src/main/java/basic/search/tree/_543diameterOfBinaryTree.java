package basic.search.tree;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/21 22:29
 */
public class _543diameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        System.out.println(node);
        int i = new _543diameterOfBinaryTree().diameterOfBinaryTree(node);
        System.out.println(i);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int dfs = dfs(root);
        return max - 1;
    }

    int max = 0;
    private int dfs(TreeNode root){
        if (root == null){
            return 0;
        }

        int l = dfs(root.left);
        int r = dfs(root.right);
        max = Math.max(l + r + 1, max);
        return Math.max(l, r) + 1;
    }
}
