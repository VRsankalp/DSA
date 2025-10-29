package Arraylist;
import java.util.ArrayList;

public class BasicArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        // Example: Add elements
        arrList.add(10);
        arrList.add(20);
        arrList.add(2,45);
        arrList.set(1,12);


        
        // Print the ArrayList
        System.out.println(arrList);
    }
}
