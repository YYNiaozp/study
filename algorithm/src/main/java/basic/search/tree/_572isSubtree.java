package basic.search.tree;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/25 13:08
 */
public class _572isSubtree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root, subRoot);
    }

    private boolean dfs(TreeNode root, TreeNode subRoot){
        if (root == null){
            return false;
        }

        return check(root, subRoot) || dfs(root.left, subRoot) || dfs(root.right, subRoot);
    }

    private boolean check(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null){
            return true;
        }

        if (root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }

        return check(root.left, subRoot.left) && check(root.right, subRoot.right);
    }


}
