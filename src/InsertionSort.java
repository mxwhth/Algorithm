/**
 * @ClassName: InsertionSort
 * @Description: 插入排序
 * @Author: tianxin
 * @Date: 2018/2/3 15:39 www.gopay.com.cn Inc.All rights reserved.
 */
public class InsertionSort {
    public static int[] sort(int[] arr) {
//        int[] newArr = null;
        if (arr != null && arr.length > 0) {
//            newArr = new int[arr.length];
            int temp;
            for (int j, i = 1; i < arr.length; i++) {
                temp = arr[i];
                j = i;
                while (j >= 1 && arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;

            }

        }
        return arr;
    }

    public static int[] sort1(int[] arr) {
        if (arr != null && arr.length > 0) {
            int i, j, v;
            for (i = 1; i <= arr.length - 1; i++) {
                v = arr[i];
                j = i;
                while (j >= 1&&arr[j - 1] > v ) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = arr[i];
            }

        }
        return arr;
    }
}
