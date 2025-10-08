class SumOfevenNumber {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;

        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++; // ✅ increment to avoid infinite loop
        }

        System.out.println("Sum of even numbers up to " + n + " = " + sum);
    }
}
