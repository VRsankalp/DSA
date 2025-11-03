import java.util.Arrays;
import java.util.Scanner;

class TwoDArray {

    public void printArray(int [][]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[][] createArrayU() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        System.out.println("Enter the elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }
    public static int [][] createArrayVariableCol(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] =new int[row][];
        
        for(int i = 0 ; i<row ; i++){
            System.out.println("enter the col");
            int col = sc.nextInt();
            arr[i]=new int[col];
             
            for(int j = 0 ; j<col;j++  ){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;

     }

    public static void main(String[] args) {
        int arr[][] = createArrayVariableCol();
        // TwoDArray obj = new TwoDArray();
        // obj.printArray(arr);
    }
}

