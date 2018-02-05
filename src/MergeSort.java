/**
 * @ClassName: MergeSort
 * @Description: 归并排序
 * @Author: tianxin
 * @Date: 2018/2/4 15:40 www.gopay.com.cn Inc.All rights reserved.
 */
public class MergeSort {
    public static int[] sort(int[] arr) {
        int[] newArr = null;
        if (arr != null && arr.length > 0) {
            newArr = new int[arr.length];
            int mid = arr.length / 2;
            spilt(arr, newArr, 0, mid);
            spilt(arr, newArr, mid + 1, arr.length - 1);
            merge(arr, newArr, 0, mid, arr.length - 1);
        }
        return newArr;
    }

    public static void spilt(int[] arr, int[] newArr, int left, int right) {
        if (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if (mid == right) {
                return;
            }
            spilt(arr, newArr, left, mid);
            spilt(arr, newArr, mid + 1, right);
            merge(arr, newArr, left, mid, right);
        }

    }

    public static void merge(int[] arr, int[] newArr, int left, int mid, int right) {
        int indexL = left;
        int indexR = mid + 1;
        while (left < mid && mid < right) {
            if (arr[left] < arr[mid]) {
                newArr[indexL] = arr[left];
                left++;
                indexL++;
            } else {
                newArr[indexL] = arr[mid];
                mid++;
                indexL++;
            }

        }
        if (arr[left] < arr[mid]) {
            newArr[indexL] = arr[left];
            newArr[++indexL] = arr[mid];
        } else {
            newArr[indexL] = arr[mid];
            newArr[++indexL] = arr[left];
        }

    }
}
