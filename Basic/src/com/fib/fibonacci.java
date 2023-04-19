package com.fib;

public class fibonacci {

	public static void main(String[] args) {
		
		int k, a=1,b=1;
		k=0;
		System.out.println(" 1 1 ");     //write another type also (a+" "b);
		while(k<=50) {
			k=a+b;
			System.out.println(k+" ");
			a=b;
			b=k;
		}


	}

}
