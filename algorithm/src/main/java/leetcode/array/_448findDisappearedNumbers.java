package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/10 12:12 上午
 */
public class _448findDisappearedNumbers {

    //public List<Integer> findDisappearedNumbers(int[] nums) {
    //    for (int i = 0; i < nums.length; i++) {
    //        if (i == nums[i] - 1) {
    //            continue;
    //        }
    //        while (i != nums[i] - 1) {
    //            if (nums[i] == nums[nums[i] - 1])
    //                break;
    //            swap(nums, i, nums[i] - 1);
    //        }
    //    }
    //    List<Integer> list = new ArrayList<>();
    //    for (int i = 0; i < nums.length; i++) {
    //        if (i != nums[i]-1)
    //            list.add(i);
    //    }
    //    return list;
    //}

    private void swap(int[] nums, int i, int j) {
        nums[i] += nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }


    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= n) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
