/**
 * @ClassName: BubbleSort
 * @Description: 冒泡排序
 * @Author: tianxin
 * @Date: 2018/2/3 10:30 www.gopay.com.cn Inc.All rights reserved.
 */
public class BubbleSort{

    public static int[] sort(int[] arr) {
        if (arr != null && arr.length > 0) {
            int temp = 0;
            boolean swap = true;
            int n = arr.length;
            for (int i = n - 1; i > 0 && swap; i--) {
                swap = false;
                for (int j = n - 1; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                        swap = true;
                    }
//                    System.out.print("第"+ (n-i) +"次：");
//                    Main.print(arr);
//                    System.out.println();
                }
            }
        }

        return arr;
    }

    public static int[] sort1(int[] arr) {

        int temp = 0;
        for (int i = arr.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

}
