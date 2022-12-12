package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/10 12:12 上午
 */

/**
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 */
public class _448findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return impl1(nums);
    }

    public List<Integer> impl1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i] - 1) {
                continue;
            }
            while (i != nums[i] - 1) {
                if (nums[i] == nums[nums[i] - 1])
                    break;
                swap(nums, i, nums[i] - 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]-1)
                list.add(i);
        }
        return list;
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] += nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }


    public List<Integer> impl2(int[] nums) {
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
