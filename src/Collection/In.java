package Collection;

interface draw{
	String shape(String str,String str2);
}

//class rectangle implements draw{
//	public void shape() {
//		System.out.println("Rectangel class!!");
//	}
//}

//class square implements draw{
//	public void shape() {
//		System.out.println("Square class!!");
//	}
//}

public class In {
	public static void main(String[] args) {
//		rectangle rect = new rectangle();
//		rect.shape();
//		square sq = new square();
//		sq.shape();
		
		draw rect = (a,b) -> a.concat(b);
		System.out.println(rect.shape("happy"," world"));
		
		
	}
}
