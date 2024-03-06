package com.dummy;

public interface NewInterface {
	public default void getAnswer() {
		System.out.println("answer");
	}
	
}
