package com.dummy;

public class LargestSubArraySum {

	public static void main(String[] args) {
		int A = 10;
		int[][] donation = {{1,3,10},{6,9,2},{3,5,3},{2,8,4},{6,7,5}};
		LargestSubArraySum arraySum = new LargestSubArraySum();
		int[] ans = arraySum.maxSubArray(A, donation);
	
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public int[] maxSubArray(int A, int[][] B) {

		 int[] donation = new int[A];
	        
	        for(int i = 0; i< B.length; i++)
	        {
	        	System.out.println(B[0].length);
	            int s = B[i][0]-1;
	            int e = B[i][1]-1;
	            int amount = B[i][2];

	            for(int j = s; j<=e; j++)
	            {
	            	System.out.println("s: " + s + " e: " + e);           
	            	donation[j] = donation[j] + amount;
	                System.out.println(donation[j]);
	            } 
	        }
	        return donation;

	}

}
