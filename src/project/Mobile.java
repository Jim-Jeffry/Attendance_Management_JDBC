package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Mobile {
	String brand;
	String model;
	int price;
	int mah;
	int mp;
	int ram;
	int rom;
	String processor;
	
	public Mobile(String brand,String model, int price, int mah, int mp, int ram, int rom, String processor) {
		super();
		this.brand=brand;
		this.model = model;
		this.price = price;
		this.mah = mah;
		this.mp = mp;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Mobile :  brand="+ brand+",    model=" + model + ",   price=" + price + ",   mah=" + mah + ",   mp=" + mp + ",   ram=" + ram + ",   rom="
				+ rom + ",   processor=" + processor +"";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mobile> sort=new ArrayList<>();
		sort.add(new Mobile("Realme", "12Pro", 30000, 5000, 50, 12, 256, "Qualcomm Snapdragon 6 Gen 1"));
		sort.add(new Mobile("Realme", "13Pro", 5000, 5000, 50, 12, 256, "Qualcomm Snapdragon 6 Gen 1"));
		sort.add(new Mobile("Vivo", "11Pro", 5000, 5000, 50, 12, 256, "Qualcomm Snapdragon 6 Gen 1"));
		sort.add(new Mobile("Oppo", "12Pro", 5000, 5000, 50, 12, 256, "Qualcomm Snapdragon 6 Gen 1"));
		sort.add(new Mobile("Samsung", "12Pro", 5000, 5000, 50, 12, 256, "Qualcomm Snapdragon 6 Gen 1"));
		sort.add(new Mobile("Apple", "12Pro", 5000, 5000, 50, 12, 256, "Qualcomm Snapdragon 6 Gen 1"));
		for(Mobile mb:sort) {
			System.out.println(mb);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("In what order you want to sort 1 Brand/2 Model/3 Price/4 Battery/5 Camera/6 Ram/7 Rom/8 Processro");
		int n=sc.nextInt();
		Collections.sort(sort, new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				if(n==1) {
					return o1.brand.compareTo(o2.brand);
				}
				else if(n==2) {
					return o1.model.compareTo(o2.model);
				}
				else if(n==3) {
					return o1.price-o2.price;
				}
				else if(n==4) {
					return o1.mah-o2.mah;
				}
				else if(n==5) {
					return o1.mp-o2.mp;
				}
				else if(n==6) {
					return o1.ram-o2.ram;
				}
				else if(n==7) {
					return o1.rom-o2.rom;
				}
				else if(n==8) {
					return o1.processor.compareTo(o2.processor);
				}
				return 0;
				
				
			}
			
		});
		System.out.println("***********************************");
		for(Mobile mo:sort) {
			System.out.println(mo);
		}
	}

}
