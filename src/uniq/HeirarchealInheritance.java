package uniq;
class Aa{
	int a=765;
	int b=453;
}
class Bb extends Aa{
	int c=56-b;
	int d=c+a;
}
public class HeirarchealInheritance extends Aa{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchealInheritance ob=new HeirarchealInheritance();
		System.out.println(ob.a+ob.b);

	}

}
