public class First{
    public static void main(String[] args) {
        int arr [] ={1,2,3,3,4,4,5,5,5,8};
        int st = 0  ;
        int end  = arr.length-1;
        int target = 5;
        while(st<end){
            int mid = st + (end- st )/2;
            if(arr[mid]==target&&arr[mid-1]==target&&arr[mid+1]!=target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>target){
                end = mid - 1;
                
            }
            else{
                st = mid+1;            }
        }
    }
}