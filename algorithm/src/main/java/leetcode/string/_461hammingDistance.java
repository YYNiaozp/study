package leetcode.string;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/19 01:02
 */
public class _461hammingDistance {
    public int hammingDistance(int x, int y) {
        int tmp = x ^ y; // 0001 ^ 0100 -> 101
        int res = 0;
        while (tmp != 0){
            if (tmp != tmp>>1<<1){
                res++;
            }
            tmp = tmp >> 1;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(new _461hammingDistance().hammingDistance(1, 4));
    }
}
