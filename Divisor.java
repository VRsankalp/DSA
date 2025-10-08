public class Divisor {
    public static void main(String[] args) {
        int number = 15 ;
        int count = 0 ;
        for(int  i  = 1 ; i<=number ; i++){
            if(number % i == 0 ){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println(count);
    }
}
