/**
 * @ClassName: SelectionSort
 * @Description: 选择排序
 * @Author: tianxin
 * @Date: 2018/2/3 14:59 www.gopay.com.cn Inc.All rights reserved.
 */
public class SelectionSort {

    public static int[] sort(int[] arr) {
        if (arr != null && arr.length > 0) {
            int i, j, temp, min;
            for (i=0;i<arr.length;i++) {
                min = i ;
                for (j = i+1;j<arr.length;j++) {
                    if (arr[j]<arr[min]) {
                        min = j;
                    }
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }
        return arr;
    }


}
