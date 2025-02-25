package dhinz;

public class Dhinz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int m=0;
		int o=5;
		for(int i=3;i>0;i--) {
			for(int j=n;j>0;j--) {
				System.out.print(" ");
			}
			n--;
			for(int j=m;j<5;j++) {
				System.out.print("*");
			}
			m-=2;
			for(int j=o;j>0;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
