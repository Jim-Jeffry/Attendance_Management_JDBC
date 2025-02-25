package constructor;

import java.util.Scanner;
public class zopattern{
	static void pattern(int size){
		for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++){
				int min = Math.min(Math.min(i,j),Math.min(size - i + 1, size - j + 1));
				if(min %2 == 1){
					System.out.print("1 ");
				}
				else{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		zopattern ob = new zopattern();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the pattern: ");
		int size = sc.nextInt();
		pattern(size);
	}
}
