import java.util.ArrayList;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,1};
        int st = 0 ;
        int k= 3 ;
        int sum = 0 ;
        ArrayList<Integer>as = new ArrayList<>();
        for (int end = st ; end<arr.length; end++){
            if( end < k ){
                sum+=arr[end];
            }
            if(end>=k){
                as.add(sum);
                sum-=arr[st];
                 sum+=arr[end];
                st++;


            }
            


        }
        System.out.println( as);


    }

}
