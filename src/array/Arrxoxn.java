package array;
import java.util.Scanner;
public class Arrxoxn {
	int board[][]= {{1,2,3},{4,5,6},{7,8,9}};
	char player='X';
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Arrxoxn obj=new Arrxoxn();
	obj.board();
}
 void board() {
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board.length;j++) {
			System.out.print(board[i][j]+"    ");
		}
		System.out.println();
		System.out.println();
	}
}
 boolean  win() {
	 for(int i=0;i<board.length;i++) {
		 if(board[i][0]==player&&board[i][1]==player&&board[i][2]==player) {
			 return true;
		 }
		 else if(board[0][i]==player&&board[1][i]==player&&board[2][i]==player) {
			 return true;
		 }
			 }
	 if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player) {
		 return true;
	 }
	 if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player) {
		 return true;
	 }
	 return false;
 }
 boolean tie() {
	 for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			if(board[i][j]!=player) {
				return false;
			}
			}
			}
	 return true;
 }
}
