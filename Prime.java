 public class Prime {
    public static void main(String[] args) {
        int no = 17 ;
        int flag = 0 ;
        for(int i = 2 ; i < no ; i++){   // checks divisibility from 2 up to no-1
            if(no % i == 0){
                flag = 1 ;              // divisor found → not prime
            }
        }
        if(flag == 1){
            System.out.println("the number is not prime");
        }
        else {
            System.out.println("the number is prime");
        }
    }
}
