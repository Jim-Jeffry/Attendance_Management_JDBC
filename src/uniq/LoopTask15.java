package uniq;

public class LoopTask15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
