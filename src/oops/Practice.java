package oops;

public class Practice {
	String name;
	int rollno;
public void add() {
	System.out.println(name);
	System.out.println(rollno);
}
public void values(String n,int r) {
	name=n;
	rollno=r;
	add();
}
public static void main(String[]arg){
	Practice obj=new Practice();
	obj.values("jim",123); 
	obj.values("Jeffry",321);
	obj.values("isuh", 234);
}
}