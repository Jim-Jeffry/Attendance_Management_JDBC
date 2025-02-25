package MultiTasking;
import java.util.Scanner;
public class StringGet {
	String input="Name=\"abc\"company=\"uniq\"Experince=\"3yrs\"";
	char tar='=';
	char sem='"';
	int counte=0;
	int counts1=0;
	int counts2=0;
	char in[]=input.toCharArray();
	void str() {
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==sem) {
				counts1=i;
				for(int j=i;j<=i+i;j++) {
					if(input.charAt(j)==sem) {
					counts2=j;
					System.out.println(input.substring(i, j+1));
					}
				
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		StringGet obj=new StringGet();
		obj.str();
	}
}