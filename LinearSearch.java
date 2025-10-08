public class LinearSearch {
    public static int linSer(int []arr , int element){
        int ans = 0 ;
        for(int i =  0 ; i<arr.length;i++){
            if(arr[i]==element){
                ans = i ;
                break;
                
            }
        }
        return ans ; 
    }
    public static void main(String[] args) {
        int [] arr = {12,34,5,67,5,3,5};
        int res =  linSer(arr, 67);
       System.out.print(res);
    }
    
}
