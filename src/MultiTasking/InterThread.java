package MultiTasking;
import java.util.Scanner;
class store{
	Scanner sc=new Scanner(System.in);
	int book=50;
	synchronized void book_count() {
		System.out.println("Books Available "+book);
		System.out.println("How many books you want");
		int need=sc.nextInt();
		if(need<=book) {
			book-=need;
			System.out.println("Remaining Count of book is "+book);
		}
		else {
			System.out.println("Books out Of Stock.......");
			System.out.println("Please wait.....");
			try {
				wait();
			}
			catch(Exception e) {}
		}
		book-=need;
		System.out.println("Remaining Count of book is "+book);
	}
	synchronized void book_count2() {
		System.out.println("Books Available "+book);
		System.out.println("How many books you want");
		int need=sc.nextInt();
		if(need<=book) {
			book-=need;
			System.out.println("Remaining Count of book is "+book);
		}
		else {
			System.out.println("Books out Of Stock.......");
			System.out.println("Please wait.....");
			try {
				
				wait();
			}
			catch(Exception e) {}
		}
	}
	synchronized void load() {
		System.out.println("How many books want to add");
		int addbooks=sc.nextInt();
		book+=addbooks;
		notifyAll();
	}
}
class one extends Thread{
	store ob;
	one(store ob){
		this.ob=ob;
	}
	public void run() {
		ob.book_count();
	}
}
class two extends Thread{
	store ob;
	two(store ob){
		this.ob=ob;
	}
	public void run() {
		ob.book_count2();
	}
}
class three extends Thread{
	store ob;
	three(store ob){
		this.ob=ob;
	}
	public void run() {
		ob.load();
	}
}
public class InterThread {
	public static void main(String[] args) {
		store obj=new store();
		one ob1=new one(obj);
		two ob2=new two(obj);
		three ob3=new three(obj);
		ob1.start();
		ob2.start();
		ob3.start();
	}
}