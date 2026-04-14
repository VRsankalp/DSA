import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> dq = new ArrayDeque<>();

        int idx = 3;
        int val = 90;

        dq.add(21);
        dq.add(89);
        dq.add(67);
        dq.add(60);
        for(int i = 0 ;i<dq.size(); i++){
            if(idx==i){
                dq.add(val);
            }
            else dq.add(dq.remove());

        }
        System.out.println(dq);
    }
}