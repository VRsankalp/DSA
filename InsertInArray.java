import java.util.Arrays;
import java.util.Scanner;
public class InsertInArray { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // initializing the array 
        int arrr[]= new int[n+1];

        for(int i = 0 ; i<n ; i++){
            arrr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arrr));

        //insert at the indexvfi
        int id = sc.nextInt();
        int val = sc.nextInt();

        // insert the value

        for(int i = n-1;i>=id-1;i--){
            arrr[i+1]=arrr[i];

        }
        System.out.println(Arrays.toString(arrr));

        arrr[id-1]=val;
        System.out.println(Arrays.toString(arrr));


  
    }
}
