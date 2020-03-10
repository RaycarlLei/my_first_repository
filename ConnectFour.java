/*
import java.util.Arrays;
import java.util.Scanner;
class ConnectFour {
    char[][] board = new char[0][0];
    static Scanner d =  new Scanner(System.in);
    public static int getInt(){
        int input = d.nextInt();
        //s.close();
        return input;
    }


    public static void createBoard(int r, int c){
        char[][] board = new char[r][c];
    }
    public static void printBoard(char[][] array){
        //print the board
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void initializeBoard(char[][] array){
        //set all to -
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                array[i][j] = '-';
            }
        }

    }

    public static boolean checkFull(char[][] array){
        int count = 0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (array[i][j] == '-'){
                    count++;
                }
            }
        }
        if (count == 0){
            return true;
        } else{
            return false;
        }
    }

    public static int insertChip(char[][] array, int col, char chipType){
        //place tocken
        for (int i = array.length-1;i>=0;i--){
            if(array[i][col] == '-'){
                array[i][col] = chipType;
                return i;
            }
        }
        return 999;
    }

    public static boolean checkIfWinner(char[][] array, int col, int row, char chipType){
        //check win or not
        for (int i=array.length-1;i>=0;i--){
            for (int j=array[0].length-1;j>=0;j--){
                if (array[i][j]==chipType){
                    int count =0;


                    for (int k=0;k<array.length;k++){
                        if (array[k][j] == chipType) {
                            count++;
                        }
                        }
                    if (count>=4){
                        return true;
                    } else {
                        count = 0;
                    }

                    for (int u=0;u<array[0].length;u++){
                        if (array[i][u] == chipType) {
                            count++;
                        }
                    }
                    if (count>=4){
                        return true;
                    } else {
                        count = 0;
                    }
                    }
                }
            }

            return false;
    }


    public static void main(String[] args) {
        boolean keepRuning = true;


        System.out.println("What would you like the height of the board to be? ");
        int h = getInt();
        System.out.println("What would you like the length of the board to be?");
        int l = getInt();
        char[][] board = new char[h][l];
        initializeBoard(board);
        printBoard(board);
        System.out.println();
        System.out.println("Player 1: x\n" +
                "Player 2: o");

        while (keepRuning){
            System.out.println("Player 1: Which column would you like to choose?");
            int p1 = getInt();
            int temp = insertChip(board,p1,'x');
            if(temp!=999){
                board[temp][p1] = 'x';
            }
            printBoard(board);

            //temp test
            if (checkIfWinner(board,temp,p1,'x')){
                System.out.println("Player 1 won the game!");
                break;
            }

            if(checkFull(board)) {
                System.out.println("Draw. Nobody wins.");
                break;
            }



            System.out.println("Player 2: Which column would you like to choose?");
            int p2 = getInt();
            int temp2 = insertChip(board,p2,'x');
            if(temp2!=999){
                board[temp2][p2] = 'o';
            }
            printBoard(board);

            //temp test
            if (checkIfWinner(board,temp2,p2,'o')){
                System.out.println("Player 2 won the game!");
                break;
            }

            if(checkFull(board)) {
                System.out.println("Draw. Nobody wins.");
            break;
            }
        }
    }
}*/
public class ConnectFour{
    public static void main(String[] args) {
        System.out.println("args = " + args);
        System.out.println("args.length = " + args.length);
        for(String name:args){
            System.out.println("name = " + name);
            
        }
/*        String[] potato = {"aaa","bb","ccc"};
        for (String name:potato){

            System.out.println("name = " + name);
            name = "k";
            System.out.println("name(after name = k;) = " + name);
        }
        for (String name2:potato){
            System.out.println("name2 = " + name2);
    }*/
    }

}