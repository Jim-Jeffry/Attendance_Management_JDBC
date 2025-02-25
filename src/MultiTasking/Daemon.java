package MultiTasking;

public class Daemon extends Thread{
	public void run() {
		System.out.println("bca");
		for(int i=0;i<10;i++) {
			System.out.println("Hello"+i);
		}
	}
	public static void main(String[] args) {
		
		Daemon dd=new Daemon();
		dd.setDaemon(true);
		dd.start();

	System.out.println("abc");
	System.out.println("abc");System.out.println("abc");System.out.println("abc");System.out.println("abc");System.out.println("abc");System.out.println("abc");System.out.println("abc");
//		for(int i=0;i<10;i++) {
//			System.out.println("Hlo"+i);
//		}
//		System.out.println("abc");
//		}
	}
}
