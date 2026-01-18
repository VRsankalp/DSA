import java.util.HashSet;

public class Nhashset {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 2, 3, 5, 3};
        int k = 4;

        for (int i = 0; i <= arr.length - k; i++) {
            HashSet<Integer> hs = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                hs.add(arr[j]);
            }

            System.out.println(hs.size());
        }
    }
}
