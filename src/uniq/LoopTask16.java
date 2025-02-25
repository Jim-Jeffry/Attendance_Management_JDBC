package uniq;
public class LoopTask16 {
public static void main(String[]arg) {
	for(int i=1;i<=5;i++) {
		char ch='a';
		for(int j=i;j<=4;j++) {
			System.out.print(" ");
		}
		for (int k=1;k<=i;k++) {
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
	}
}
}