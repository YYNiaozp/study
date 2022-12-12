package leetcode.backtrack;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/1 23:27
 */
public class _494findTargetSumWays {
    int count;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0);
        return count;
    }

    private void backtrack(int[] nums, int target, int idx) {
        if (idx == nums.length){
            if (target == 0){
                count++;
            }
        } else {
            backtrack(nums, target + nums[idx], idx + 1);
            backtrack(nums, target - nums[idx], idx + 1);
        }
    }
}
