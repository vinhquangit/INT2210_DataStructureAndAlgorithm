import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    int[] arr;

    public BinarySearch(int N) {
        arr = new int[N];
    }

    public void randomGenerate() {
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(20);
        }
        Arrays.sort(arr);
    }

    public int binarySearch(int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return mid;
            else if (x > arr[mid]) low = mid + 1;
            else if (x < arr[mid]) high = mid - 1;
        }
        return -1;
    }

    public void printArray() {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Random ran = new Random();
        int N = ran.nextInt(10);
        BinarySearch bS = new BinarySearch(N);
        bS.randomGenerate();
        bS.printArray();
        System.out.println();
        System.out.println(bS.binarySearch(10));
    }

}
