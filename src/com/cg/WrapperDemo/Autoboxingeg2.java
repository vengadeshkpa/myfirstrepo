package com.cg.WrapperDemo;

public class Autoboxingeg2 {
	public static void main(String[]args) {
		//what are the types data i can pass in f1 methhod//
		f1(99);//data type//
		f1(true);//class name//
		f1("have a nice day");//string name//
		
	}
	//since object is the root of all java class //now the f1 can accept any kind//
	static void f1(Object obj) {
		System.out.println(obj);
		System.out.println(obj.getClass().getName());
		System.out.println("-------------------");
		
	}

}
