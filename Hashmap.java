import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer>menu= new HashMap<>();
        menu.put("pizaaa", 60);
        menu.put("Nodles", 90);
        menu.put(" Burger", 80);
        menu.put("Schezwan Noodles", 220);
        // contain funcrtion in java
        if(menu.containsKey("pizaaa")){
            System.out.println(menu.get("pizaaa"));
        }
        System.out.println(menu);
    }
    
}
