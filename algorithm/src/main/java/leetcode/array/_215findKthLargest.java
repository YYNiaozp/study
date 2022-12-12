package leetcode.array;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/2 00:55
 */
public class _215findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, k, 0, nums.length - 1);
    }

    private int quickSort(int[] arr,int km,  int l, int r) {
        if (l < r) {
            int key = arr[l];
            int i = l;
            int j = r;
            while (i < j) {
                while (i < j && arr[j] > key) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (i < j && arr[i] < key) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = key;
            //quickSort(arr, l, i - 1);
            //quickSort(arr, i + 1, r);
        }
        return 1;
    }
}
