package com.dummy;

//private static class object
//private constructor
//static getInstance() method

public class Singleton3 {

	private static Singleton3 obj = new Singleton3();
    private Singleton3() {}
 
    public static Singleton3 getInstance()
    {
        return obj;
    }
}
//If you notice carefully once an object is created synchronization is no longer useful 
//now obj will not be null and any sequence of operations will lead to consistent results. 
//So we will only acquire the lock on the getInstance() once when the obj is null.