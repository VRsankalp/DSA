import java.util.Arrays;

public class WaveArray {
    public static void arrayWave( ){
        int arr [][] = {{1,2,3,4},{5,6,7,8},{9 , 10, 11, 12}};
        int i = 0 ;
        int j = 0 ;
        while(i<3 && j<4){
            int val = 0 ;
            while(j==val && i<3){
                System.out.print(Arrays.toString(arr[i][i]));
                i++;
            }
            val++;
            j++;
        }

    
         
 


    }
    public static void main(String[] args) {
        arrayWave();
        
    }
}
