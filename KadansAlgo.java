public class KadansAlgo {

    public static void main(String[] args) {

         int arr []={1,2,3,2,1,4};
         int n = arr.length;
         int  prefixSum[] = new int[6];
          prefixSum[0]=arr[0];
         for(int i = 1; i<arr.length ; i++){
            prefixSum[i]=arr[i]+prefixSum[i-1];

          }
          for(int i = 0 ; i< n ;i++){
            System.out.println(prefixSum[i]);
          }
         }
}