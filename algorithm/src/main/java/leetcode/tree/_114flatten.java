package leetcode.tree;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/6 19:04
 */

import java.util.Stack;

/**
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * <p>
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 */
public class _114flatten {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        new _114flatten().flatten(root);
        System.out.println(root);
    }
    public void flatten2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr.left != null) {
                stack.push(curr.right);
                curr.right = curr.left;
                curr = curr.left;
            }
            curr.left = curr.right;
            curr.right = stack.pop();
        }
    }

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        flattenT(root);
        root.left = null;
    }

    public TreeNode flattenT(TreeNode root) {
        if (root == null){
            return null;
        }

        TreeNode tail1 = flattenT(root.left);
        TreeNode tail2 = flattenT(root.right);
        if (tail1 != null){
            tail1.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if (tail2 != null){
            return tail2;
        } else if (tail1 != null){
            return tail1;
        }else {
            return root;
        }
    }
}
