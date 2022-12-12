package leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/18 22:14
 */

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 */
public class _78subsets {

    public List<List<Integer>> subsets(int[] nums) {
        return impl1(nums);
    }

    public List<List<Integer>> impl1(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> sub = new ArrayList<>();
        int condition = 1 << nums.length;
        for (int i = 0; i < condition; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (((i >> j) & 1) == 1) sub.add(nums[j]);
            }
            res.add(sub);
            sub.clear();
        }
        return res;
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sub = new ArrayList<>();

    public List<List<Integer>> impl2(int[] nums) {
        dfs(0, nums);
        return res;
    }

    private void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[cur]);
        dfs(cur + 1, nums);
        int i = sub.size();
        sub.remove(i - 1);
        dfs(cur + 1, nums);
    }
}
