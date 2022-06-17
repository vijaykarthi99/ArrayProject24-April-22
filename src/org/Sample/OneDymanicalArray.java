package org.Sample;

public class OneDymanicalArray {

	public static void main(String[] args) {

		int a[][] = new int[2][4];
		a[0][0] = 10;
		a[0][1] = 12;
		a[0][2] = 30;
		a[0][3] = 20;
		a[1][0] = 20;
		a[1][1] = 50;
		a[1][2] = 100;
		a[1][3] = 75;
		System.out.println("a");
		int length = a.length;
		System.out.println(length);

		// for loop
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(a[i][j]);
			}

		}
		System.out.println("***************************");
		System.out.println("Enhanced For Loop");
		//foreach loop
		for (int[] x : a) {
			for (int y : x) {
				System.out.println(y);
			}
			
		}
		System.out.println("***************************");

		String a1 =null;
		System.out.println(a1.length());


	}

}
