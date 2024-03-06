package com.dummy;

//private static volatile class object
//private constructor
//static getInstance() method
//inside that synchronized block to create obj.

public class Singleton4 {
	
	private static volatile Singleton4 singleton4 = null;
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		if(singleton4 == null)
		{
			synchronized(Singleton4.class)
			{
				if(singleton4 == null)
				{
					singleton4 = new Singleton4();
				}
			}		
		}
		return singleton4;
	}

}
//We have declared the obj volatile which ensures that multiple threads offer 
//the obj variable correctly when it is being initialized to the Singleton instance.