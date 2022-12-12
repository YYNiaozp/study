package basic.sort;

import java.util.Arrays;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/28 20:08
 */
public class Sort {
    public static void main(String[] args) {
        int[] data = {1, 2, 2, 0, 8, 2, 5, 7}; // 01222578
        Sort sort = new Sort();
        //sort.bubbleSort(data);
        //sort.insertionSort(data);
        //sort.shellSort(data);
        //sort.mergeSort(data);
        //sort.quickSort(data);
        sort.selectionSort(data);
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    /**
     * 记住最后一次交换
     */
    public int[] bubbleSort(int[] arr) {
        //控制多少轮
        for (int i = 1; i < arr.length; i++) {
            //控制每一轮的次数
            for (int j = 0; j <= arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    /**
     * n2, 1
     */
    public int[] insertionSort(int[] arr) {
        return insertionSort(arr, 1);
    }

    private int[] insertionSort(int[] arr, int gap) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int j;
            for (j = i; j >= gap; j -= gap) {
                if (curr >= arr[j-gap]){
                    break;
                }
                arr[j] = arr[j - gap];
            }
            arr[j] = curr;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    /**
     * nlogn, 1; 不稳定
     */
    public int[] shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            insertionSort(arr, gap);
        }
        return arr;
    }

    /**
     * 分治法
     * nlogn, n
     */
    public int[] mergeSort(int[] arr) {
        return mergeSort(arr, 0, arr.length);
    }

    private int[] mergeSort(int[] arr, int left, int right) {
        return null;
    }

    private void merge(int[] arr, int left, int mid, int right) {
    }

    /**
     * 分治法
     * n2, logn
     * 优化: 三路排序，减少等于部分重复处理
     */
    public int[] quickSort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int l, int r) {
        if (l >= r){
            return arr;
        }

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
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
        return arr;
    }

    /**
     * n2, n
     */
    public int[] selectionSort(int[] arr) {
        //findMin
        //swap
        return null;
    }

    /**
     * 可以认为是改进的选择排序
     * 先put, 再get
     * nlogn, 1; 不稳定
     */
    public int[] heapSort(int[] arr) {
        //构造最大堆
        //出队
        return null;
    }
}
