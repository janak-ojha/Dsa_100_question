package Sorting;
// Best case :(nlogn): for spliting it takes logn by pivot and partision it takes o(n)
// Average case : Best case
// Worst Case O(n2): when pivot element is smallest and largest. if array is already sorded ascending  or descending
public class Quick_sort {
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;  
                int temp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = temp;  
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 6, 7, 5, 4, 3};
        System.out.println("Original array:");  
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
