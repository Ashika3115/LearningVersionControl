package com.dummy;


//private static class object
//private constructor
//static getInstance() method

 class Singleton1 {
	
	private static Singleton1 singleton1;
	
	private Singleton1() {}
	
	public static Singleton1 getInstance()
	{
		if(singleton1 == null)
		{
			singleton1 = new Singleton1();
		}
		return singleton1;
	}

}

public class SingletonEx
{
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread();
		t1.start();
		
		
		
		
	}
	public void run() {
		Singleton1.getInstance();
		System.out.println("first instance");
	}
}


//Not thread safe.
//When another thread will try to use this class, it might end up creating another objet