package com.dummy;



public class MergeTwoArrays {
	public static void main(String args[]) {
	
		int[] A = {2,4,6,8};
		int[] B = {1,3,5,7};
		int[] C = new int[A.length +B.length];
		
		for(int i = 0; i<A.length; i++)
		{
			if(A[i]>B[i])
			{
				if(i==0)
				{
				C[i] = B[i];
				C[i+1] = A[i];
				}
				else
				{
					C[i+1] = B[i];
					C[i+2] = A[i];
				}
				}
				else
				{
					if(i==0)
					{
					C[i] = A[i];
					C[i+1] = B[i];
					}
					else
					{
						C[i+1] = A[i];
						C[i+2] = B[i];
					}
				}
				}
		
		for(int i = 0; i<C.length; i++)
		{
			System.out.println(C[i]);
		}
		

	}
	

}
