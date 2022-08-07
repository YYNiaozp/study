package leetcode.stack;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/7 15:06
 */

/**
 * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * <p>
 * 请你找出符合题意的 最短 子数组，并输出它的长度。
 */
public class _581findUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int begin = 0;
        int end = -1;
        int min = nums[len - 1], max = nums[0];

        for (int i = 0; i < len; i++) {
            if (nums[i] < max) { //从左到右维持最大值，寻找右边界end
                end = i;
            } else {
                max = nums[i];
            }

            if (nums[len - 1 - i] > min){ //从右到左维持最小值，寻找左边界begin
                begin = len - 1 - i;
            } else {
                min = nums[len - 1 - i];
            }
        }

        return end - begin + 1;
    }
}
