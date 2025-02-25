package uniq;

public class LoopTask20 {
	public static void main(String[]arg) {
		int c=1;
		int n=1;
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			if(c%2==0) {
				System.out.print(n+" ");
				n++;
			}
			else {
				System.out.print(ch+" ");
				ch++;
			}
			c++;
			}
			System.out.println();
		}
	}

}
