package com.dummy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;


public class StringMethodImpl {

	public static void main(String[] args) throws Exception {
			

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o = null;
			// Must be used to hold the reference of the instance of the class Solution.Inner.Private
			StringMethodImpl impl = new StringMethodImpl();
			  Inner inner = impl.new Inner();
	            Inner.Private p = inner.new Private();
	            System.out.println(num + " is "+ p.powerof2(num)); 
	            o = p;
		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		
		}//end of try
		
		catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}//end of main
	public class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}//end of Solution

 
	
