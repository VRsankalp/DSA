public class Equilibrium {
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 2, 2};
        int n = arr.length;

        // Prefix sum
        int pref[] = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = arr[i] + pref[i - 1];
        }

        // Suffix sum
        int dref[] = new int[n];
        dref[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            dref[i] = arr[i] + dref[i + 1];
        }

        int i = 0;
        while (i < n) {
            int leftSum  = (i == 0) ? 0 : pref[i - 1];
            int rightSum = (i == n - 1) ? 0 : dref[i + 1];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium Index: " + i);
                return;
            }
            i++;
        }

        System.out.println("No Equilibrium Index");
    }
}
