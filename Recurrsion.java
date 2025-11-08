public class Recurrsion {
    public static void goToHome(int initial , int destiny){
        if(initial==destiny){
            System.out.println("reached home ");
            return;
        }
        else{
            initial = initial+1;
            System.out.println("taking one step" +(initial));
            goToHome(initial, destiny);
        }
    }
    public static void main(String[] args) {
    goToHome(0 , 3);
    }
    
}

