package MultiTasking;
class trd1 extends Thread{
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("extends");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
class trd2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Implements");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
public class Muti1 {

	public static void main(String[] args) {
		System.out.println("************");
		trd1 obj1=new trd1();
		obj1.setName("Thread - Mutta");
		obj1.run();
		obj1.start();
		System.out.println("*****************************");
		Thread obj2=new Thread(new trd2());
		obj2.setName("Thread - Ontru");
		obj2.run();
		obj2.start();
		System.out.println("************************");
		
		System.out.println(obj2.isAlive());
		System.out.println(1 + 2 + "3" + 4 + 5);
	}

}
