package array;

public class IntString {
	public static void main(String[] args) {
		String a="3a2b1c";
		String a3="";
		int n=0;
		char c[] = a.toCharArray();
		for(int i=0;i<a.length();i++) {
			 if(c[i]%1==0) {
				 n=c[i]-'0';
				 for(int j=0;j<n;j++) {                     
					 a3=a3+c[i+1];
				 }
				 i++;
			 }
		}
System.out.println(a3);
}
}