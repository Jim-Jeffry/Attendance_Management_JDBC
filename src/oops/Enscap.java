package oops;

public class Enscap {
	private String name;
	private int age;
	String getName(){
		return name;
	}
	void setName(String name) {
		this.name=name;
		System.out.println(getName());
	}
	int getAge() {
		return age;
	}
	void setage(int age) {
		if(age>=18) {
			this.age=age;
			System.out.println(getAge());
		}
		else {
			System.out.println("Age is Under 18");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enscap obj=new Enscap();
		obj.setName("Jim");
		obj.setage(38);
	}

}
