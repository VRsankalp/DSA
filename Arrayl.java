import java.lang.classfile.constantpool.IntegerEntry;
import java.util.ArrayList;

public class Arrayl {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(100);
        // Example: Add elements
        arrList.add(10);
        arrList.add(20);
        arrList.add(1,49);
        arrList.set(1,34);
        arrList.remove(1);
        // if an you want to remove the valur 20 
        arrList.remove(Integer.valueOf(20));         
        System.out.println(arrList);
    }
}
    

