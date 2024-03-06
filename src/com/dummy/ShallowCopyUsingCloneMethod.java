package com.dummy;

class Test1 {
	int x;
	int y;
}

class Test2 implements Cloneable {
	int a;
	int b;

	Test1 t1 = new Test1();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Test2 t2 = new Test2();
		t2.t1 = new Test1();
		t2.t1.x =50;
		t2.t1.y = 60;
		return t2;
	}
}

public class ShallowCopyUsingCloneMethod {

	public static void main(String args[]) throws CloneNotSupportedException {
		Test2  test2 = new Test2();
		test2.a = 10;
		test2.b = 20;
		test2.t1.x = 30;
		test2.t1.y = 40;
		
		System.out.println("a = "+test2.a +"b= "+ test2.b +"x=  "+test2.t1.x +"y= "+test2.t1.y);
		
		Test2 test22 = (Test2)test2.clone();
		System.out.println("a = "+test22.a +"b= "+ test22.b +"x=  "+test22.t1.x +"y= "+test22.t1.y);
		
		test22.a = 100;
		test22.b = 200;
		test22.t1.x = 300;
		test22.t1.y = 40;
		
		System.out.println("a = "+test22.a +"b= "+ test22.b +"x=  "+test22.t1.x +"y= "+test22.t1.y);
		
	}
}
