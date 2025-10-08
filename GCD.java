import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int n1 = 32;
        int n2 = 12 ;
        Scanner sc = new Scanner(System.in)
        int minValue = Math.min(n1 , n2 );
        int numbr= 0 ;
        for(int i = 2 ; i<=minValue ;i++ ){
            if(n1%i==0 && n2%i==0){
                numbr = i ;

            }
        }
        System.out.println(numbr);
    }
}
