package com.dummy;

//private static class object
//private constructor
//static synchronized getInstance() method

public class Singleton2 {
	
	private static Singleton2 singleton2;
	
	private Singleton2() {
		
	}
	
	public static synchronized Singleton2 getInstance()
	{
		if(singleton2 == null)
		{
			singleton2 = new Singleton2();
		}
		return singleton2;
	}

}

//This makes the getInstance()method thread-safe.
//But it reduces the performance of the application. 
//This is suitable if performance of getInstance() is 
//not critical for application this method provides a clean and simple solution.