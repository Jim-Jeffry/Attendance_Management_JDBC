package InnerClass;
public class AnnyThread {
	public static void main(String[] args) {
		Thread obj=new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("User 2"+Thread.currentThread().getName());
				}
			}
		};
		Thread obj1=new Thread(){
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("User 2"+Thread.currentThread().getName());
				}
			}
		};
		obj.start();
		obj1.start();
	}
}