package quickSort;

import bubbleSort.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSortRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numberList = new int[1000000];
        for(int i = 0; i<numberList.length; i++){
            numberList[i] = random.nextInt(1000000);
        }

        int[] arr = {4, 3, 1, 2};
        System.out.println("======= Before Quick Sort ======");
        System.out.println(Arrays.toString(arr));
        System.out.println("======= After Quick Sort ======");
        QuickSort.quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}