package array;
import java.util.Scanner;
public class ArrXoN {
	static int board[][]= {{1,2,3},{4,5,6},{7,8,9}};
	static char player='X';
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			board();
		System.out.println("Player "+player+" Select between(1-9)");
		int move=sc.nextInt();
		if(move<1||move>9|| board[(move - 1) / 3][(move - 1) % 3] == 'X' || board[(move - 1) / 3][(move - 1) % 3] == 'O') {
			System.out.println("Invalid Move Try Again");
			continue;
		}
		board[(move - 1) / 3][(move - 1) % 3] = player;
		if(winning()) {
			board();
            System.out.println("Player " + player + " wins!");
            break;
		}
		if(tie()) {
			board();
            System.out.println("The Game is Tie");
            break;
		}
		player = (player == 'X') ? 'O' : 'X';
		}
	}
	static void board(){
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
	    System.out.println("-----------");
	    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
	    System.out.println("-----------");
	    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
	}
	static boolean winning() {
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}
			if(board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}
		}
			if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
				return true;
			}
			if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
				return true;
			}
			return false;
					
		
	}
		static boolean tie() {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(board[i][j]!='X'&& board[i][j]!='O') {
						return false;
					}
				}
			}
			return true;
		}
			}