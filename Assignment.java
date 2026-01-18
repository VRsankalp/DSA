// import java.security.Key;
// import java.util.HashMap;
// import java.util.HashSet;

// public class Assingmnet {
//     public static void main(String[] args) {
//         int A [] = {2,1,4,8};
//         int B [] = {3,6,2,10,10};
//         int c [] = new int[5];
//         HashSet<Integer>hs = new HashSet<>();
//         for(int i = 0 ; i< A.length;i++){
//             hs.add(A[i]);

//         }
//         int index=0;
//         for(int i = 0 ; i<index;i++){
//             if(hs.contains(B[i])){
//                 c[index++]= B[i];

//             }
//         }
//         // HashSet<Integer>hs1 = new HashSet<>();
//         // for(int i = 0 ; i< B.length;i++){
//         //     hs1.add(B[i]);

//         // }
//         for(int i= 0;  i<c.length ; i++){
//             System.out.print(c[i]);
//         }

//     }
    
// }
import java.util.HashSet;

public class Assignment {
    public static void main(String[] args) {

        int A[] = {2, 1, 4, 10};
        int B[] = {3, 6, 2, 10, 10};

        int c[] = new int[B.length];
        HashSet<Integer> hs = new HashSet<>();

        // store A elements
        for (int i = 0; i < A.length; i++) {
            hs.add(A[i]);
        }

        int index = 0;

        // check B elements
        for (int i = 0; i < B.length; i++) {
            if (hs.contains(B[i])) {
                c[index++] = B[i];
            }
        }

        // print result
        for (int i = 0; i < index; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

