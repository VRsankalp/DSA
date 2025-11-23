public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // ✅ Correct formula

            if (arr[mid] == key) {
                System.out.println("Value found at index: " + mid);
                return mid;
            } else if (arr[mid] < key) { // ✅ Correct comparison
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("The value is not present");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        binarySearch(arr, 7);
    }
}
