package dhinz;

import java.util.*;

class Dhinz2 {
	public void swap(){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter (small or capital): ");
        char ch = sc.next().charAt(0);

        String caps = (ch >= 97 && ch <= 122) ? String.valueOf((char) (ch - 32)) : 
                     (ch >= 65 && ch <= 90) ? String.valueOf((char) (ch + 32)) : 
                     "Invalid input!";
        System.out.print(caps);
        System.out.println();
        swap();
	}
    public static void main(String[] args) {
    	Dhinz2 obj=new Dhinz2();
    	obj.swap();
    }
}

