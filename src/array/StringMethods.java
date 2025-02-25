package array;

public class StringMethods {

		public static void main(String[] args) {
			String s="java is a programming language";
			String s1="java";
			System.out.println(s==s1);
			String st=new String("java");
			String st1=new String("Java %n program");
			System.out.println(st==st1);
			s.concat(" program");//java program
			System.out.println(st1);
			System.out.println(s.charAt(2));
			System.out.println(s.contains("j "));//java 
			System.out.println(s.endsWith("java "));//java = a
			System.out.println(s.equals(st1));// check content only in string
			System.out.println(s.equalsIgnoreCase(st1));
			System.out.println(s.indexOf("a"));//java
			System.out.println(s.lastIndexOf("a"));
			//System.out.println(s.repeat(3));
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
			String ss[]= {"hello %n java","hy"};
			System.out.println(ss[0]);
			System.out.println(String.format(ss[0], ss));
			String s11="java is a programming language";
			System.out.println(s11);
			String str[]=s11.split(" ");//java,is,a,programming,language
			for(String ob:str)
			{
			//	System.out.println(ob);
				
			}
			System.out.println(str.length);
			String s111="java";
			System.out.println(s111);
			System.out.println(s111.trim());
			String st11=new String("java");//97-98
			System.out.println(s111.compareTo(st11));//-1
		    System.out.println(s111.substring(5));	//start
		    System.out.println(s111.substring(1,7));//start and end 
		    System.out.println(s111.toCharArray());//j,a,v,a
	    	char[] ch=s111.toCharArray();
	    	for(char cc:ch) {
	    		System.out.println(cc);
	    	}
			String str1=new String("hello");
			String str11=new String("hello");
			String s1111=str11.intern();
			String s2=str11.intern();
	        System.out.println(s1111==s2);
		}

	
}
