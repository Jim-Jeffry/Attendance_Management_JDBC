package array;
import java.util.*;
public class Xoxo {
	static char board[][] = {{'1', '2', '3'},
            		  		 {'4', '5', '6'},
            		  		 {'7', '8', '9'}};
	static char v='X';
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Xoxo ob=new Xoxo();
	}
static void board() {
	
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(board[i][j]+"    ");
		}
		System.out.println();
		System.out.println();
	}
}
static boolean win() {
	for(int i=0;i<3;i++) {
		if(board[i][0]==v&&board[i][1]==v&&board[i][2]==v) {
			return true;
		}
		if(board[0][i]==v&&board[1][i]==v&&board[2][i]==v) {
			return true;
		}
	}
	if(board[0][0]==v&&board[1][1]==v&&board[2][2]==v) {
		return true;
	}
	if(board[0][2]==v&&board[1][1]==v&&board[2][1]==v) {
		return true;
	}
	return false;
}
static boolean tie() {
	for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] != 'X' && board[i][j] != 'O') {
                return false;
}	
}
	}
	return true;
}
{
while(true) {
	board();
	Scanner sc=new Scanner(System.in);
    System.out.println("Player " + v + ", enter your move (1-9):");
    int value = sc.nextInt();
    if (value < 1 || value > 9 || board[(value - 1) / 3][(value - 1) % 3] == 'X' || board[(value - 1) / 3][(value - 1) % 3] == 'O') {
        System.out.println("Invalid move. Try again.");
        continue;
    }
    board[(value - 1) / 3][(value - 1) % 3] = v;
     if(win()) {
    	 System.out.println("Player " + v + " wins!");
         break;
    }
     if (tie()) {
        board();
        System.out.println("The game is a tie!");
        break;
    }
    v = (v == 'X') ? 'O' : 'X';
}
}
}