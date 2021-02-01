package battleships;
import java.util.Scanner;
import java.util.Random;
public class BattleShips {
    
    public static Scanner input = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
    //creating a 10 by 10 grid using an array
    String [][] board = new String[10][10];
    //generating random cordinates for battle ship
    for (int i = 0; i < 20; i++) {
        int max = 10;
        int min = 1;   
        int l = rand.nextInt((max-min)+min);
        int j = rand.nextInt((max-min)+min);
        board [l][j] = "x";
    }
    //requesting cordinates
    System.out.println("Enter the x cordinate you would like to hit");
    int x = input.nextInt();
    System.out.println("Enter the y cordinate you would like to hit");
    int y = input.nextInt();
    //checking if user hit a ship
    if (board[x][y]=="x"){
        for (int i = 0; i < board.length; i++) {
            System.out.println("You hit a battle ship");
        }
    }else{
        System.out.println("You missed");
     }
    }
}
