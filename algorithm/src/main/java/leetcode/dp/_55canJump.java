package leetcode.dp;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/22 01:51
 */

/**
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标。
 */
public class _55canJump {

    public boolean canJump(int[] nums) {
        if (nums.length < 2){
            return true;
        }

        int dp = nums[0];
        int i;
        for (i = 1; i < nums.length && dp > 0; i++) {
            dp = Math.max(dp - 1, nums[i]);
            if (dp == 0 && i == nums.length - 1){
                return true;
            }
            if (dp <= 0){
                return false;
            }
        }

        return dp > 0;
    }
}
