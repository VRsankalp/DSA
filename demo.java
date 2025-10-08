import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc  = new  Scanner(System.in);
        // int cal = 1 ;
        System.out.println("entre the number");
        int n = sc.nextInt();
        // while (cal<n){
        //     System.out.println("1 step running ");
        //     cal = cal +1;
        // }
        // while (n>=1){
        //     System.out.println(n);
        //     n--;
        // }
    //     int i=1;
    //     while(i<=n){
    //         if(i%2==0){
    //             System.out.println(i);
    //         }
    //         i++;
    //     }
        
    // }
     int sum = 0;
     int i = 1 ;
     while(i<n){
        sum=sum+i ;
        i++;
     }
    
}
}
