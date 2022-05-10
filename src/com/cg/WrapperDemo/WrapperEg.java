package com.cg.WrapperDemo;

public class WrapperEg {
	
	public static void main(String[]args) {
	
		int a=9;//data not functional//has its ony data//
		
		 Integer b=new Integer(a);//wrapping in a object autoboxing//predefined//
		System.out.println(a);
		System.out.println(b);//if we print same output//
	
		System.out.println(Integer.toBinaryString(9));//this speciality not in data type//
		System.out.println(Integer.toHexString(19));
		
		String str="999";
		
		int val=Integer.parseInt(str);
		//
		//int to a string//
		System.out.println(val);
		
		
		
		
		
		

	}
}


