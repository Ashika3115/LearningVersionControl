package com.dummy;

public class Triplet {

	public static void  main(String[] args)
	{
		int[] A = {26,23,23,16,27,18,7};
		int[] B = {17,23,30,19,8,17,17};
		
		solve(A);
		//solve(B);
		
		
	   
	        
	}
	
	static void solve(int[] A)
	{
	     int ans = 0;
	     
	        for(int i =0; i<A.length; i++)
	        {
	        	int count = 0;
	            int x = A[i];
	            for(int j = i+1; j<A.length-1; j++)
	            {
	            	int m = A[j+1];
	            	System.out.println("m :" +m);
	                if(A[i]<A[j])
	                {
	                 System.out.println("For pair : " + A[i] + " and " +A[j]);
	                	count++;
	                    System.out.println("count = " + count);
	               
	                }
	               
	            }
	            if(count >=2)
                {
                    ans = ans + (count - 1 );
                    System.out.println("ans = "+ ans);
                }
	        }
	}

}
