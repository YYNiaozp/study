package leetcode.other;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/9 10:52 下午
 */
public class _1twosum {
    public static void main(String[] args) {
        int[] ints = new _1twosum().twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
    }

    //public int[] twoSum(int[] nums, int target) {
    //    for (int i = 0; i < nums.length; i++) {
    //        for (int j = i + 1; j < nums.length; j++) {
    //            if ((nums[i] + nums[j]) == target) {
    //                return new int[]{i, j};
    //            }
    //        }
    //    }
    //    return null;
    //}

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length, 1);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
