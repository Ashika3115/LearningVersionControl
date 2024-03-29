package com.dummy;

import java.util.Scanner;

public class JavaSubStringComparison {
	
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "xyz";
	        String largest = "ABC";
	        
	        for(int i = 0; i<s.length()-k +1;i++)
	        {
	        	String sub = s.substring(i, i+k);
	        	System.out.println(sub);
	            if(sub.compareTo(smallest)<0)
	            {
	             smallest = sub;
	            }
	            if(sub.compareTo(largest)>0)
	            largest = sub;
	        }
	        
	        return smallest + "\n" + largest;
	    }
	 
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }

}
