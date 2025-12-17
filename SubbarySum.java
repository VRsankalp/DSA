import java.sql.Array;

class SubbarySum{
    public static void main(String[] args) {
        int sum = 0 ;
        int arr [] = {2,1,3};
        int ps[] = new int[arr.length];
        ps[0]=arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            ps[i]=ps[i-1]+arr[i];
        }
        for(int i = 0; i< arr.length ; i++){
            for(int j = i ; j <arr.length ; j++){
                if(i == 0){
                    sum +=ps[j];
                }
                else{
                    sum+=ps[j]-ps[i-1];
                }

                
            }




            // for(int j = i; j< arr.length; j++){

            //     // for(int k = i ; k<= j ;k++){
            //     //     sum = sum+arr[k];
            //     // }
                

            // }

        }
        System.out.println(sum);
    }

};