package basic.search.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/13 1:23 上午
 */
public class _145postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        TreeNode prev = null;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root !=null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev){
                list.add(root.val);
                prev = root;
                root = null;
                } else {
                    stack.push(root);
                    root = root.right;
                }
        }
        return list;
    }
}
