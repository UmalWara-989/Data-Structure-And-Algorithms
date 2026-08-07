public class SelectionSort {
     // Time Complexity = O(n2)

    public static void main(String[] args) {
        int arr[] = {3,43,1,6,90,76,4,0,5};
        int minIndex = -1;

        System.out.println("Before Sorting");
        printArray(arr);

        sortArray(arr,minIndex);

        System.out.println("\nAfter Sorting");
        printArray(arr);

    }

    // Actual Algorithm Sorting
    public static void sortArray(int[] arr, int minIndex){
        int size = arr.length;
        int temp = 0;


        for (int i = 0; i < size; i++) {
            minIndex = i;

            for (int j = i+1; j < size-1; j++) {
                if (arr[minIndex] > arr[j]) 
                    minIndex = j;
                
            }
            
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                

            System.out.println();
            printArray(arr);
        }
    }

    // Sort Array
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
