package basic.search.tree;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/22 01:13
 */

/**
 * 给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，请构造二叉树并返回其根节点。
 */
public class _105buildTree {
    public static void main(String[] args) {
        TreeNode treeNode = new _105buildTree().buildTree(new int[]{1, 2}, new int[]{2, 1});
        System.out.println(treeNode);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return myBuildTree(preorder, inorder, 0, preorder.length);
    }

    int i = 0;

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int inorder_left, int inorder_right) {
        if (inorder_left >= inorder_right){
            return null;
        }

        if (inorder_left + 1 == inorder_right) {
            i++;
            return new TreeNode(inorder[inorder_left]);
        }

        int j = inorder_left;
        while (preorder[i] != inorder[j]) {
            j++;
        }
        TreeNode node = new TreeNode(preorder[i++]);
        node.left = myBuildTree(preorder, inorder, inorder_left, j);
        node.right = myBuildTree(preorder, inorder, j + 1, inorder_right);
        return node;
    }
}
