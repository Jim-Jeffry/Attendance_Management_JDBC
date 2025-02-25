package array;
public class Reve {
public static void main(String[] args) {
	String a="Hello World";
	for(int i=5-1;i>=0;i--) {
		String b;
		b=a.substring(i,i+1);
		System.out.print(b);
	}
	System.out.println();
	for(int i=11-1;i>=0;i--) {
		String b;
		b=a.substring(i,i+1);
		System.out.print(b);
	}
}
}