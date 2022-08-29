package com.bridgelabday03;

public class ReverseArray {

	public static void main(String arg[]) {
		int array[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		for (int index=0; index<array.length; index++) {
			System.out.print(array[index]+" ");
		}
		System.out.println();
	for(int index = array.length-1;index >= 0; index --) {
		System.out.print(array[index]+" ");
	}
	}
}
