import java.util.Scanner;

public class ArraywithUserInput {
    public static  void printArray(int[] marks){
            for (int x : marks){
            System.out.println(x);
            }
            
    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
         for (int x : arr){
            System.out.println(x);
            }
            
    }
}
