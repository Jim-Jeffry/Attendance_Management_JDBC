package array;
import java.util.*;
public class ArrXoXo {
	
	void step0(){
		int board[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
	    System.out.println("-----------");
	    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
	    System.out.println("-----------");
	    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
	}
	void step1(){
		String board[][]= {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("Player X Select a Number Between 1-9");
			int p1=sc.nextInt();
			if(p1==1) {	
				 board[0][0]="X";
				 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
			}
			else if(p1==2){
				board[0][1]="X";
			 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
			}
			else if(p1==3){
				board[0][2]="X";
			 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
			}
			else if(p1==4){
				board[1][0]="X";
			 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
			}
			else if(p1==5){
				board[1][1]="X";
			 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
			}
			else if(p1==6){
				board[1][2]="X";
			 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
			}
			else if(p1==7){
				board[2][0]="X";
			 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
			}
			else if(p1==8){
				board[2][1]="X";
			 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
			}
			else if(p1==9){
				board[2][2]="X";
			 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
			}
			
			for(int j=0;j<1;j++) {
				System.out.println("Player O Select a Number Between 1-9");
				int p2=sc.nextInt();
				if(p2==1) {	
					 board[0][0]="O";
					 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
					    System.out.println("-----------");
					    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
					    System.out.println("-----------");
					    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
				}
				else if(p2==2){
					board[0][1]="O";
				 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
				}
				else if(p2==3){
					board[0][2]="O";
				 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
				}
				else if(p2==4){
					board[1][0]="O";
				 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
				}
				else if(p2==5){
					board[1][1]="O";
				 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
				}
				else if(p1==6){
					board[1][2]="O";
				 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
				}
				else if(p2==7){
					board[2][0]="O";
				 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
				}
				else if(p2==8){
					board[2][1]="O";
				 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
				}
				else if(p2==9){
					board[2][2]="O";
				 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
				    System.out.println("-----------");
				    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
				}
			}
		}
		System.out.println("Player X Select a Number Between 1-9");
		int p3=sc.nextInt();
		if(p3==1) {	
			 board[0][0]="X";
			 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
			    System.out.println("-----------");
			    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		}
		else if(p3==2){
			board[0][1]="X";
		 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		}
		else if(p3==3){
			board[0][2]="X";
		 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		}
		else if(p3==4){
			board[1][0]="X";
		 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		}
		else if(p3==5){
			board[1][1]="X";
		 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		}
		else if(p3==6){
			board[1][2]="X";
		 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		}
		else if(p3==7){
			board[2][0]="X";
		 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		}
		else if(p3==8){
			board[2][1]="X";
		 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		}
		else if(p3==9){
			board[2][2]="X";
		 	System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		    System.out.println("-----------");
		    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		}
	}	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrXoXo ob=new ArrXoXo();
	ob.step0();
	ob.step1();
}
}
