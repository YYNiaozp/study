package leetcode.array;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/9 11:23 下午
 */
public class _88merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1;
        int i2 = n - 1;
        int i3 = m + n - 1;
        while (i1 >= 0 && i2 >= 0) {
            nums1[i3--] = nums1[i1] < nums2[i2] ? nums2[i2--] : nums1[i1--];
        }

        while (i1 >= 0) {
            nums1[i3--] = nums1[i1--];
        }

        while (i2 >= 0) {
            nums1[i3--] = nums2[i2--];
        }
    }
}
