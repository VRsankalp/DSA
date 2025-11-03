import java.util.Arrays;
class ArraySo{
    public static void main(String[] args) {
        int arr[] = {2,3,8,9,46};
        int sum = 15;
        Arrays.sort(arr); 
        int i = 0 ;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]>sum){
                j--;
                
            }
            else if(arr[i]+arr[j]==sum){
                System.out.println(arr[i]+"  "+arr[j]);
                i++;
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}