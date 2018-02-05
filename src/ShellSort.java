/**
 * @ClassName: ShellSort
 * @Description: 希尔排序
 * @Author: tianxin
 * @Date: 2018/2/3 18:32 www.gopay.com.cn Inc.All rights reserved.
 */
public class ShellSort {

    //交换
    public static int[] sort(int[] arr) {
        if (arr != null && arr.length > 0) {
            int s, k, temp;
            for (s = arr.length / 2; s >= 1; s /= 2) {
                for (int i = 0; i < s; i++) {
                    for (k = i; k < arr.length; k += s) {
                        if ((k + s) < arr.length && arr[k] > arr[k + s]) {
                            temp = arr[k];
                            arr[k] = arr[k + s];
                            arr[k + s] = temp;
                        }
                    }

                }
            }

        }
        return arr;
    }

    //滑动
    public static int[] sort1(int[] arr) {
        if (arr != null && arr.length > 0) {
            int i, j, v, h, temp;
            h = arr.length / 2;
            for (; h >= 1; h /= 2) {
                for (i = 0; i < arr.length; i++) {
                    temp = arr[i];
                    j = i;
                    while ((j - h) >= 0 && arr[j - h] > temp) {
                        arr[j] = arr[j - h];
                        j -= h;
                    }
                    arr[j] = temp;
                }

            }

        }
        return arr;
    }
}
