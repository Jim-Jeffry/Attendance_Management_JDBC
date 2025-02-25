package uniq;

public class LoopTask12 {
	public static void main(String[]arg) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("o");
			}
			System.out.println();
		}
	}

}
