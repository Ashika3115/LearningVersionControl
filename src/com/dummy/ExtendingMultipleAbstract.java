package com.dummy;

class Ex{
	 static void populate(int a) {
			System.out.println(a);
		}
}
 class DerivedClass extends Ex{
	static void populate(int a)
	{
		System.out.println(a);
	}
}
public  class ExtendingMultipleAbstract   {
	 static void populate(int a) {
			System.out.println(a);
		}
		
		 static void populate(int a, int b)
		{
			System.out.println(a + b);
		}
	
	public static void main(String args[]) {
		
		
		ExtendingMultipleAbstract a = new ExtendingMultipleAbstract();
		a.populate(1);
		a.populate(1, 2);

	}

}
