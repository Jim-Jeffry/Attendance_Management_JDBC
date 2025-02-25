package oops;
import java.util.*;
	class details{
	   	String name;
	    int     reg;
	    char    sec;
	details(String name,int reg,char sec){
		this.name=name;
		this.reg=  reg;
		this.sec=  sec;
		}
	void m1() {
		System.out.println(name+" "+reg+" "+sec);
		}
	}
	public class Constructor1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name, Registen number, Section");
		details c1=new details(sc.next(),sc.nextInt(),sc.next().charAt(0));	
		details c2=new details(sc.next(),sc.nextInt(),sc.next().charAt(0));	
		details c3=new details(sc.next(),sc.nextInt(),sc.next().charAt(0));	
		c1.m1();
		c2.m1();
		c3.m1();
		}
}