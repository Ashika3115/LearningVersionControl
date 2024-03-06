package com.dummy;

public interface CheckDefaultMethodViaInterface {
	
	public  default void getMessage()
	{
		System.out.println("Welcome to the Ecplise");
	}

}
