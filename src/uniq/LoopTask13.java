package uniq;

public class LoopTask13 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i%2==1) {
				for(char c='a';c<'a'+i;c++) {
				System.out.print(c+" ");
				}
			}
			else {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			}
			System.out.println();
		}
	}
}