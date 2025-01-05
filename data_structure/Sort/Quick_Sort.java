package Sort;
public class Quick_Sort {
    // quick sort  =  moves smaller elements to left of a pivot.
    //                recursively divide array in 2 partitions
    public static void main(String[] args) {
        int[] array = {8,2,5,3,9,4,7,6,1};
        QuickSort(array,0,array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    private static void QuickSort(int[] array,int start,int end){
        if(end<=start) return;  //base case.
        int pivot = partition(array,start,end);
        QuickSort(array, start, pivot-1);
        QuickSort(array,pivot+1,end);
    }
    private static int partition(int[] array,int start,int end){
        int pivot = array[end];
        int i = start-1;
        for(int j=start;j<=end-1;j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;   // i-iig ingej neg increment hiisnii daraa,i-iin index ni
        int temp = array[i];    // pivot ireh yostoi index deer irchih tul,end-tei solij bn.
        array[i] = array[end];
        array[end] = temp;
        return i;  // location of our pivot genedee.
    }
}
