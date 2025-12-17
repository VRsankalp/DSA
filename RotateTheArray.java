public class RotateTheArray {

    public static void reverse(int arr[], int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {        
        int arr[] = {1, 2, 3, 4};
        int size = arr.length;
        int n = 2;

        n = n % size;   

        reverse(arr, 0, size - n - 1);
        reverse(arr, size - n, size - 1);
        reverse(arr, 0, size - 1);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
