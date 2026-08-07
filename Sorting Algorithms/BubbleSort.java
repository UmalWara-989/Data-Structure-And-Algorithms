public class BubbleSort {
    // Time Complexity = O(n2)

    // Main method
    public static void main(String[] args) {
        int arr[] = {3,43,1,6,90,76,4,0,5};
        
        System.out.println("Before Sorting");
        printArray(arr);

        sortArray(arr);

        System.out.println("\nAfter Sorting");
        printArray(arr);



    }
    // Actual Algorithm Sorting
    public static void sortArray(int[] arr){
        int size = arr.length;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-1; j++) {

                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
