package com.dummy;

public class ScalarMultipleLeftRotations {

	public int[][] solve(int[] A, int[] B) {
		int[][] ans = new int[B.length][A.length];

		int[] modifiedArray = new int[A.length];
		for (int i = 0; i < B.length; i++) {
			if(B[i]>A.length)
			{
				B[i] = B[i] % A.length;
			}
			
			for (int j = 0; j < A.length; j++) {
				modifiedArray[j] = A[j] % B[i] + 1;
			}
			ans[i] = modifiedArray;
		}

		return ans;

	}

	public static void main(String[] args) {
	
		int[] a = {1,2,3,4,5};
		int[] b = {2,3};
		
		ScalarMultipleLeftRotations solve = new ScalarMultipleLeftRotations();
		
		int[][] ans = solve.solve(a, b);
		for(int i = 0; i<ans.length;i++)
		{
			for(int j = 0; j<ans[i].length;j++)
			{
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}

	}

}
