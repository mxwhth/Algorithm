import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {4,3,6,5,9,0,8,1,7,2};
        int[] arr = getRandomArray(1000);

        long start = System.currentTimeMillis();

        System.out.println("Final Result: ");
        print(MergeSort.sort(arr));
        System.out.println();

        System.out.println("time: " + (System.currentTimeMillis() - start));

    }

    public static void print(int[] arr) {
        for (Integer x : arr) {
            System.out.print(String.valueOf(x) + " ");
        }
    }

    public static int[] getRandomArray(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n - 1; i++) {
            arr[i] = random.nextInt(10000);
        }
        System.out.println("Random Array: ");
        print(arr);
        System.out.println();
        return arr;
    }
}
