package leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/13 1:02 上午
 */
public class _144preorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root !=null || !stack.isEmpty()){
            while (root != null){
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop().right;
        }
        return list;
    }

        //public List<Integer> preorderTraversal(TreeNode root) {
    //    List<Integer> list = new ArrayList<>();
    //    preorderTraversal(root, list);
    //    return list;
    //}
    //
    //private void preorderTraversal(TreeNode root, List<Integer> list) {
    //    if (root == null) {
    //        return;
    //    }
    //    list.add(root.val);
    //    preorderTraversal(root.left, list);
    //    preorderTraversal(root.right, list);
    //}
}
