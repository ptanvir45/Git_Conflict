package com.swapNumber;

public class SwapNumber {

	public static void main(String[] args) {

//		int a = 15;
//		int b = 23;
//		int c;
//		c = b;
//		b = a;
//		a = c;

//		System.out.println("The value of a before swap" + a);
//		System.out.println("The value of b before swap" + b);
//
//		System.out.println("The value of a after swap" + a);
//		System.out.println("The value of b after swap" + b);
		
		//------------------------
		
		int d=5;
		int e=8;
		
		e=e+d;
		e=e-d;
		d=d-e;
		
		System.out.println("The value of a before swap" + e);
		System.out.println("The value of b before swap" + d);

		System.out.println("The value of a after swap" + e);
		System.out.println("The value of b after swap" + d);
		
		

	}

}
