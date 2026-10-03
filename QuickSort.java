public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {

        int i = low;
        int j = high;
        int pivot = arr[(low + high) / 2];

        do {

            while (i <= high && arr[i] < pivot) {
                i++;
            }

            while (j >= low && arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        } while (i <= j);

        // Sort left side
        if (low < j) {
            quickSort(arr, low, j);
        }

        // Sort right side
        if (i < high) {
            quickSort(arr, i, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 6, 3, 10, 7, 20, 9};
        System.out.println("Unsorted Array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");

        }
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}