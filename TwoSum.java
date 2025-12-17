import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int target = 5 ;
        HashMap<Integer, Integer>hm = new HashMap<>();
        for(int i = 0 ; i< arr.length ; i++){
            if(hm.containsKey(target-arr[i])){
                System.out.println( "true");
            }
           hm.put(arr[i],i);
        }
        

    }
    
}
