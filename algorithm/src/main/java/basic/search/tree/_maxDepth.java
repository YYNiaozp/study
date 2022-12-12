package basic.search.tree;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/22 01:40
 */
public class _maxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
