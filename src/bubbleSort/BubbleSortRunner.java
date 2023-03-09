package bubbleSort;

import insertionSort.InsertionSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int[] arr={9,7,6,15,17,5,10,11};

        System.out.println("=========before insertion sort===========");
        System.out.println(Arrays.toString(arr));
        System.out.println("=========after insertion sort===========");
        BubbleSort.bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
