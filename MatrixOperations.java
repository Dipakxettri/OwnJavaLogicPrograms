
//Matrix Operations In Java

import java.util.Scanner;//import Scanner class in our java file

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2D array
        int [ ][ ] board = {
            {0,0,0,},//row 1
            {0,0,0},// row 2
            {0,0,0}// row 3
        };
        //Main Loop
        while (true){
            System.out.print("  Enter row  :");
            int row = sc.nextInt();//input for row
            System.out.print("  Enter column  :");
            int column = sc.nextInt();//input for column
            System.out.print("  Enter value  :");
            int value = sc.nextInt();//value going to add
            
            board[row][column]= value;//assiging the given value to the given row and column
            System.out.println("\n  Matrix updated successfully\n");
            
            //printing the updated array - board
                for (int i = 0; i<board.length; i++){
                    for (int j = 0; j<board[0].length; j++){
                        System.out.print("  " + board[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            System.out.println("\n");
            System.out.print("   Do you want to exit this program ? yes/no :");
            String ask = sc.next();//input for ask whatever to exit or not
            if (ask.equals("yes")){
                System.out.println("\n  Program quit\n");
                break;
                //if the condition is true then break or exit the loop
            }
            else{
                System.out.println("\n  runs again\n");
                // else run loop again 
            }
        }
        sc.close();//close the scanner after the program ends
}
}

//program ends

                         
