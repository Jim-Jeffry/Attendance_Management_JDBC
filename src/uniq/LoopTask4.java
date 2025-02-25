package uniq;
public class LoopTask4 {
	public static void task() {
		// TODO Auto-generated method stub
		int a=1;
		while(a>=1&&a<=30) {
			System.out.println(a);
			if(a%4==0) {
			a++;
			a++;
			}
		}
		}
		public static void main(String[] args) {
			task();
	}
}
