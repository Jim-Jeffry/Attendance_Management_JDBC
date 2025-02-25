package array;
class bla extends Thread {
	public void run() {
		System.out.println("This is MultiTasking using extends");
	}
}
class lab implements Runnable {
	public void run() {
		System.out.println("This is MultiTasking using implements");
	}
}
class sleep extends Exception{
	public void slee() {
		for(int i=0;i>5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			}
			catch(Exception e){
			
			}
		}
	}
}
public class MultiTasking {
	public static void main(String[] args) {
		bla  ob=new bla ();
		ob.start();
		Thread  obj=new Thread (new lab());
		obj.start();
		System.out.println(ob.getName());
		System.out.println(obj.getName());
		System.out.println(Thread.currentThread().getName());
		obj.setPriority(2);
		sleep obj1=new sleep();
		obj1.slee();
	}
}