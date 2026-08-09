// Time Comlexity = O(n(logn)) 

// Main class
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,4,8,2,1,5,9,0};
        
        System.out.println("Before Sorting");
        InsertionSort.printArray(arr);

        // Algorithm
        mergeSort(arr,0,arr.length-1);
   

        System.out.println("After Sorting");
        InsertionSort.printArray(arr);
    }

    // Actual Sorting Algorithm 
    public static void mergeSort(int[] arr,int l, int r){
        if (l<r) {
            int mid = (l+r)/2;

            //Recursive calls
            mergeSort(arr,l,mid);
            mergeSort(arr, mid+1, r);

            //Merging
            merge(arr,l,mid,r);

            MergeSort.printArray(arr);
            
        }
    }

    // Merge method
    private static void merge(int[] arr, int l, int mid, int r) {
        // length of partitioned Arrays
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lArray = new int[n1];
        int[] rArray = new int[n2];

        for (int x = 0; x < n1; x++) {
            lArray[x] = arr[l+x];
        }
        for (int y = 0; y < n2; y++) {
            rArray[y] = arr[mid+1+y];
        }

        int i=0;
        int j=0;
        int k=l;

        // Merge both Arrays
        while (i<n1 && j<n2) {
            if (lArray[i] <= rArray[j]) {
                arr[k] = lArray[i];
                i++;
            }
            else{
                arr[k] = rArray[j];
                j++;
            }
            k++;
        }

        // Remaining values merging
        while (i<n1) {
            arr[k] = lArray[i];
            i++;
            k++;
        }
        while (j<n2) {
            arr[k] = rArray[j];
            j++;
            k++;
        }

    }

    // Print Array
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
}
    
}
