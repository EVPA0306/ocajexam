package com.evpa.ocajexam.exercises.chaptersix;

public class MainClassArray {
	public static void main(String[] args) {
		int[][] intArr = {{1,2},{3,4}};
		for (int i=0; i<intArr.length;i++) 
			for (int j=0; j<intArr.length; j++)
				System.out.print(intArr[i][j]);

		//
		System.out.println("============");
		int[] grid = intArr[1];
		System.out.println(grid[0]);

		System.out.println("============");
		int[][] oddSizeArray = {{1,2},{3,4,5,6},{7,8,9}};
		//for (int i=0; i<oddSizeArray.length; i++)
			System.out.println(oddSizeArray[1][2]);			

		System.out.println("Step 3 ============");

		int[][][] array3D = new int[2][][];
			array3D[0] = new int[3][];
			System.out.println(array3D[0][0]);
	}
}