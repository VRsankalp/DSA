import java.util.HashMap;

public class AASS2 {
    public static void main(String[] args) {
        int arr[] = {10,5,3,4,3,5,6};

        HashMap<Integer, Integer> hm = new HashMap<>();

        int min = Integer.MAX_VALUE; // FIX 1
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int ssr = hm.get(arr[i]); // first index

                if (ssr < min) {
                    min = ssr;//herer is wromg
                    
                    res = arr[i];
                }
            } else {
                hm.put(arr[i], i);
            }
        }

        // FIX 2: print after loop
        System.out.println("First repeating element: " + res);
    }
}
