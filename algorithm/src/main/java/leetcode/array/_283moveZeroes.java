package leetcode.array;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/9 11:37 下午
 */
public class _283moveZeroes {
    public static void main(String[] args) {
        new _283moveZeroes().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0, n = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (n!=i){
                    nums[n] = nums[i];
                    nums[i] = 0;
                }
                n++;
            }
        }
    }
}
