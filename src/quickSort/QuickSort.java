package quickSort;

public class QuickSort {

    public static void quickSort(int []arr, int lowIndex, int highIndex){
        if(lowIndex>=highIndex){
            return;
        }
        //selecting the pivot element
        int pivot = arr[highIndex];
        int leftPointer = partition(arr, lowIndex, highIndex, pivot);
        //call the method recursively for the subarray, which is left side of pivot
        quickSort(arr, lowIndex, leftPointer-1);

        //call the method recursively for the subarray, which is right side of pivot
        quickSort(arr, leftPointer+1, highIndex);

    }

    //parsing the array depending on the pivot point
    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        //define left and right pointers
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while (leftPointer<rightPointer){

            while(arr[leftPointer]<= pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            while (arr[rightPointer]>= pivot && leftPointer<rightPointer){
                rightPointer --;
            }

            swap(arr, leftPointer, rightPointer);

        }
        //we are swapping pivot element with the element pointed by leftPointer
        swap(arr, leftPointer, highIndex);
        return leftPointer;
    }

    //this method will swap elements of given array
    private static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
