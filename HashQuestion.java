import java.util.HashMap;
import java.util.HashSet;

public class HashQuestion {
    public static void main(String[] args) {
        int arr[]= {8,1,2,4,5,10,0,6,7};
        int target= 9 ; 
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i = 0 ; i < arr.length ;i++){
            if(hm.containsKey((target-hm.keySet(i)))){
                if(hm.key(target)!=hm.key(i))
                System.err.println("found");

            }
            else{
                hm.put(i, arr[i]);
            }

        }
    }
    
}
