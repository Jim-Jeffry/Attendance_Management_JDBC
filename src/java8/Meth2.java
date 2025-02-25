package java8;

import java.util.function.BiFunction;

public class Meth2 {
	
	public String vo(String s1,String s2) {
		return s1.concat(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meth2 obj = new Meth2();
		BiFunction<String,String,String> Conc =  obj :: vo;
		System.out.println(Conc.apply("jim"," jeffry"));
		BiFunction<String,String,String> cov=String ::concat;
		System.out.println(cov.apply("sdfg" , "sdfgh"));
	}
}
