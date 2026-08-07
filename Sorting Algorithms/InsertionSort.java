public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,2,9,1,0,8,3};

        // Before Sorting
        System.out.println("Before Sorting");
        InsertionSort.printArray(arr);

        // Algorithm
        InsertionSort.sortArray(arr);

        // After Sorting
        System.out.println("After Sorting");
        InsertionSort.printArray(arr);
    }

    // Actual Sorting Algorithm 
    public static void sortArray(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
            InsertionSort.printArray(arr);
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
