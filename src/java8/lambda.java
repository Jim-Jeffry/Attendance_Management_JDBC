package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lambda {

	public static void main(String[] args) {
		Runnable r=()->System.out.println(Thread.currentThread().getName());
		Thread t=new Thread(r);
		t.start();
		System.out.println(Thread.currentThread().getName());
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(30);
		al.add(10);
		al.add(15);
		al.add(5);
		//Collections.sort(al);
		System.out.println(al);
		
		Comparator<Integer>  c=(x,y)->y-x;
		Collections.sort(al,c);
		System.out.println(al);
		
		
		
		
	}

}
