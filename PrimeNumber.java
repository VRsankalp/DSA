public class PrimeNumber {
    public  static void primeNumber( int val ){
        int flag = 0  ;
        for(int i = 2  ; i < Math.sqrt(val) ; i++){
            if(val%i==0){
                flag = 1;
                break;
                

            }
            
        }
        if(flag == 1 ){
            System.out.println("not a prime");
            
        }
        else {
            System.out.println("prime number");
        }

         
    }
    public static void main(String[] args) {
        primeNumber(47);
    }

}
