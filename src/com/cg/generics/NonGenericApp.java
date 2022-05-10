package com.cg.generics;

public class NonGenericApp {
 public static void main(String[]args) {
	 //sincwe val is the type of object we can store any type of data//
	 Data data1=new Data();
	 data1.setVal(99);//autoboxing (automatically convert into a integer object)upcasting//
	 
	 Data data2=new Data();
	 data2.setVal("subha");
	  
	 int x=(Integer)data1.getVal();//if it is data2,run time error//class exception typecasting for reading//
	 
	 String name=(String)data2.getVal();////typecasting for reading//
	 System.out.println(x);
	 System.out.println(name);
	 
 }
}
//object class--number(subclass).string(subclass)//
class Data{
	private Object val;
	//storing is not a problem//reteriving peoperly//

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}
	
}