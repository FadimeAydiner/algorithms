package selectionSort;

import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {
        int[] arr={7,4,5,9,8,2,1};
        System.out.println("=========before selection sort===========");
        System.out.println(Arrays.toString(arr));
        System.out.println("=========after selection sort===========");
        SelectionSort.selectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
