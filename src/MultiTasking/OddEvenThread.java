package MultiTasking;
class one1 extends Thread{
	OddEvenThread ob;
	one1(OddEvenThread ob){
		this.ob=ob;
	}
	public void run() {
		ob.odd();
	}
}
class two2 extends Thread{
	OddEvenThread ob;
	two2(OddEvenThread ob){
		this.ob=ob;
	}
	public void run() {
		ob.even();
	}
}
class run1 extends Thread{
	OddEvenThread ob;
	run1(OddEvenThread ob){
		this.ob=ob;
	}
	public void run() {
		ob.all();
	}
}
 
public class OddEvenThread  {
	synchronized void odd(){
		for(int i=1;i<=100;i++) {
			System.out.println(i+Thread.currentThread().getName());
			try {
				wait();
			}
			catch(Exception e) {}
			notify();
			i++;
		}
		
	}
	synchronized void even() {
		for(int i=2;i<=100;i++) {
			System.out.println(i+Thread.currentThread().getName());
			i++;
			try {
				wait();
			}
			catch(Exception e) {}
			notify();
		}
		
	}
	synchronized void all() {
		notifyAll();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenThread obj=new OddEvenThread();
		one1 obj1=new one1(obj);
		two2 obj2=new two2(obj);
		run1 obj3=new run1(obj);
		obj1.start();
		obj2.start();
		obj3.start();

	}

}
