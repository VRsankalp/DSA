public class Arraybasics {
    public static void main(String[] args) {
        // CREATEION OF ARRAY   
        int [] marks ={1000,20,3,4};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        for(int i  = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("");
        //for each LOOP 
        for(int x :marks){
            System.out.println(x);
        }
    }
    
}
