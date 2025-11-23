import java.util.ArrayList;
import java.util.Scanner;

public class ArratList2d {
    public static ArrayList<ArrayList<Integer>>readArrayList(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr2d=new ArrayList<>();
        for(int i = 0 ; i<row ; i++){
            arr2d.add(new ArrayList<>(row));
            for(int j = 0 ; j <col ; j++){
                int no = sc.nextInt();
                arr2d.get(i).add(no);


            }
        
        }
        return arr2d;



    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr2d=new ArrayList<>();
        ArrayList<Integer>row0 = new ArrayList<>();
        row0.add(23);
        row0.add(34);
        row0.add(33);
        row0.add(32);
        row0.add(237); ArrayList<Integer>row1 = new ArrayList<>();
        row1.add(23);
        row1.add(34);
        row1.add(33);
        row1.add(32);
        row1.add(237);
        arr2d.add(row0);
        arr2d.add(row1);
        System.out.println(arr2d);

    }
    
}
