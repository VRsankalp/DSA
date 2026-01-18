public class LittlePoint {
    public static int littel(int arr [] , int target){
        for(int i = 0 ; i< arr.length  ; i++ ){
            if(arr[i]== target){
                return i+1;

            }
            else {
                return -1 ;
            }
        }
    }
    public static void main(String[] args) {
        int arr [ ] = {1,2,3,4,5};
        int target = 3 ;
        

    }
    
}
