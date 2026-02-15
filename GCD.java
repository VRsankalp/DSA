import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        String str = "abcd";
        int n = str.length();
        for(int i = 0 ; i<=n ; i++){
            for(int j = i+1 ; j<=i ; j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
