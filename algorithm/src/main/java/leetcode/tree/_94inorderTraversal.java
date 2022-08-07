package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/13 12:18 上午
 */
public class _94inorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        new _94inorderTraversal().inorderTraversal(root);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }

    //public List<Integer> inorderTraversal(TreeNode root) {
    //    List<Integer> list = new ArrayList<>();
    //    inorderTraversal(root, list);
    //    return list;
    //}
    //
    //private void inorderTraversal(TreeNode root, List<Integer> list) {
    //    if (root == null) {
    //        return;
    //    }
    //    inorderTraversal(root.left, list);
    //    list.add(root.val);
    //    inorderTraversal(root.right, list);
    //}
}


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(this, sb);
        return sb.toString();
    }

    public void toString(TreeNode node, StringBuilder sb) {
        Queue<TreeNode> queue = new LinkedList<>();

        while (node != null || !queue.isEmpty()){
            if (node == null){
                sb.append("null").append(",");
            } else {
                sb.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            }
            node = queue.poll();
        }
    }
}

