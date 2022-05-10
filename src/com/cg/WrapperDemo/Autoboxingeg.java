package com.cg.WrapperDemo;

public class Autoboxingeg {
	
	public static void main(String[]args) {
		//prior to jdk.5//
		int a=9;
		Integer a1=new Integer(a);
		System.out.println(a);
		
		//from jdk1.5//
		Integer a2=100;//autoboxing//
		System.out.println(a2);
		Object obj1=a2;
		System.out.println(obj1);
		Object obj2=999;//autoboxing//
		Object obj3="hello capgemini";
		System.out.println(obj2);
		System.out.println(obj3);
		
		Integer a5=99;
		//prior to 1.5//
		int v1=a5.intValue();//from object to datatype//
		System.out.println(v1);
		
		//from jdk 1.5//
		int v2=a5;//autounboxuing//
		System.out.println(v2);
	}

}
