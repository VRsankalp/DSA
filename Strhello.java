import java.util.Scanner;

public class Strhello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        // sc.nextLine();//here it is written to consume an enter
        // for(int i = 0 ; i<n ; i++){
        //     String str = sc.nextLine();
        //     System.out.println(str);
        // } 
        // largest string
        
       int largestLen = 0 ;
       String largStrine  ="";
       for(int i = 0 ; i<=n ;i++){
        String line = sc.nextLine();
        if(line.length()>largestLen){
            largStrine = line ;
            largestLen = line.length();

        }
        System.out.println(largStrine);
       }

    }

    
}
