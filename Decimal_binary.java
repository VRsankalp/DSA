 public class Decimal_binary {

    public static int binaryTodecimal(int n) {
        int ans = 0;
        int p = 1;

        while (n != 0) {
            int last_bit = n % 10;
            ans = ans + last_bit * p;
            p = p * 2;   // update power of 2
            n = n / 10;  // reduce n
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.print(binaryTodecimal(11001));  // Output: 25
    }
}
