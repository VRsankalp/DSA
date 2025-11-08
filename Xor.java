import java.util.ArrayList;
import java.util.Arrays;

public class Xor {
    public static int uniqeXor(ArrayList<Integer>a){
        int res = 0 ;
        for(int x : a){
            res = res^x;
        }
        
        return res ;

    }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>(Arrays.asList(1,2,3,4,54,3,2,1));
        System.out.println(uniqeXor(arr));

    }
    
}
