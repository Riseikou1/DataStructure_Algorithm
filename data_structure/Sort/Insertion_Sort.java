package Sort;
public class Insertion_Sort {
    //  Insertion sort  =  after comparing elements to the left
    //                     shift elements to the right to make room to insert a value
    //                     Quaratic time O(n^2)
    //                     small dataset = decent  .  large dataset = BAD
    //
    //                     Less steps than Bubble Sort
    //                     Best case is O(n) comparted to Selection Sort O(n^2)package Sort;
    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        InsertionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    private static void InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];  // The current element to be inserted
            int j = i - 1;  // Start comparing with the previous element
            // Shift elements of the sorted part to the right
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];  // Shift element one position to the right
                j--;
            }
            // Place the current element in its correct position
            array[j + 1] = temp;
        }
    }
}


