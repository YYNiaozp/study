package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/18 21:20
 */

/**
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库的sort函数的情况下解决这个问题。
 */
public class _75sortColors {
    public static void main(String[] args) {
        List<int[]> cases = new ArrayList<>();
        //cases.add(new int[]{2});
        cases.add(new int[]{2, 0, 1});
        //cases.add(new int[]{0, 1, 2, 2, 1, 0});
        _75sortColors instance = new _75sortColors();
        cases.forEach(c -> {
            instance.sortColors(c);
            System.out.println(Arrays.toString(c));
        });
    }

    public void sortColors(int[] nums) {
        impl1(nums);
    }

    private void impl1(int[] nums) {
        if (nums == null) {
            return;
        }

        int first = -1;
        int last = nums.length;
        int i = 0;

        while (i < last) {
            switch (nums[i]) {
                case 0:
                    compare(i, ++first, nums);
                    break;
                case 2:
                    compare(i, --last, nums);
                    continue;
            }
            i++;
        }
    }

    private void compare(int i, int j, int[] nums) {
        if (i == j) {
            return;
        }
        nums[i] += nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
