public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");
        s1.ensureCapacity(100);
        s1.append("booy");
        System.out.println(s1);
    }
}
