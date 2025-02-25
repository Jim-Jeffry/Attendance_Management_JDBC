package MultiTasking;
public class ThreadName extends Thread{
	public void run(){
	}
	public static void main(String[] args) {	
		for(int i=0;i<=100;i++) {
			ThreadName obj=new ThreadName();
		obj.start();
		System.out.println(obj.getName());
		}
	}
}