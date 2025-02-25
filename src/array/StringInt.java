package array;

public class StringInt {
public static void main(String[] args) {
	String a="aaaabbbcc";
	char b[]=a.toCharArray();
	char c=1;
	int d=c;
	for(int i=0;i<a.length()-1;i++) {
		if(b[i]==b[i+1]) {
			c++;
		}
		else {
			d=d+b[i];
		}
	}
	System.out.println(d);
}
}
