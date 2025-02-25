package MultiTasking;
class sy{
	synchronized void sy1() {
	for(int i=0;i<5;i++) {
		System.out.println("Hello");
	}
	}
}
class sys extends Thread{
	synchronized void sy2() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
		}
	}
}
public class Syncronized extends Thread {

	public static void main(String[] args) {
		
	}

}
