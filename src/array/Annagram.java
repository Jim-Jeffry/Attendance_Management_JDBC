package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Annagram {
	 void m1() {
		  String wrds[]= {"evil","eat","df","bad","abd","ate","tea","vile","flat"};  
		  ArrayList<String> s11=new ArrayList<String>();
		  ArrayList<ArrayList<String>> s3=new ArrayList<ArrayList<String>>();
		  String temp1;
		  char[] temp11;
		  String temp2;
		  char[] temp22;
		  for(int i=0;i<wrds.length;i++) {
			  ArrayList<String> s1=new ArrayList<String>();
			  temp1=wrds[i];
			  temp11=temp1.toCharArray();
			  Arrays.sort(temp11);
			  String sortedTemp1 = new String(temp11);
			  for(int j=i+1;j<wrds.length;j++) {
				  temp2=wrds[j];
				  temp22=temp2.toCharArray();
				  Arrays.sort(temp22);
				  String sortedTemp2 = new String(temp22);
				  if(sortedTemp1.equals(sortedTemp2)) {
					  
					  if(!s1.contains(temp1)) {
						  s1.add(temp1);
						  s11.add(temp1);
					  }
					   if(!s1.contains(temp2)) {
						  s1.add(temp2);
						  s11.add(temp2);
						  if(!s3.contains(s1)) {
							  s3.add(s1);
						  }
					  }
					     
				  }
			  }
		  }
		  for(int i=0;i<wrds.length;i++) {
			  if(!s11.contains(wrds[i])) {
				  ArrayList<String> s2=new ArrayList<String>();
				  s2.add(wrds[i]);
				  s3.add(s2);
			  }
		  }
		  
		  System.out.println(s3);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annagram obj=new Annagram();
		obj.m1();
	}
}