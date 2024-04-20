package util;

/**
 * @Author: zhangpeng
 * @Date: 2023/10/15 20:21
 */
public class Util {
    public static void swap(int[] nums, int i, int j){
        nums[i] += nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] -= nums[j];
    }
}
