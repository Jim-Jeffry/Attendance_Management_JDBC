package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

 class product implements Comparator<product>{
	String name;
	int price;
	int quantity;
	product(String name,int price,int quantity){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product obj1=new product("Apple", 10, 100);
		product obj2=new product("Banana", 15, 150);
		product obj3=new product("Orange", 8, 120);
		List<product> plist=new ArrayList<>();
		plist.add(obj1);
		plist.add(obj2);
		plist.add(obj3);
		plist.sort(new product("b", 0, 7));
		for(product Pro:plist) {
			System.out.println("Name: " + Pro.name + ", Price: " + Pro.price + ", Quantity: " + Pro.quantity);
		}
	}
	@Override
	public int compare(product o1, product o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.price, o2.price);
	}
	public int compare1(product o1, product o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo( o2.name);
	}
	public int compare3(product o1, product o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.quantity, o2.quantity);
	}

}
