package java8rev;
interface bala{
	void man();
	default void man1() {
		
	}
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bala b2=new bala();
bala b1=new bala() {

	@Override
	public void man() {
		// TODO Auto-generated method stub
		
	}
	
}
	}

}
