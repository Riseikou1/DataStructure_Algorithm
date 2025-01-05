package Search;
public class Linear_Search {
    /*  linear search  =  Iterate through a collection one element at a time.
     *        runtime complexity : O(n)
     *      Disadvantages :  Slow for large datasets
     *      Advantages  :  Fast for of small to medium datasets.
     *                     Does not need to be sorted.
     *                     Useful for data structures that do not have random access(linked list)  */                    
    public static void main(String[] args) {
        int[] array = {9,1,8,2,7,3,6,4,5};
        int index = linearSearch(array,1);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found.");
        }
    } 
    private static int linearSearch(int[] array, int value) {
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
}
