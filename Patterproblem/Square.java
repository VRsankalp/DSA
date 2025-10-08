package Patterproblem;

public class Square {
    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {          // Rows
            for (int j = 0; j < 3; j++) {      // Columns
                System.out.print("* ");
            }
            System.out.println();  // Move to next line after each row
        }
    }
}
