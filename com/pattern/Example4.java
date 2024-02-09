package com.pattern;

public class Example4 {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		int factorial=1;
		for(i=1;i<=n;i++) {
//		while(i<=n) {
			factorial*=i;
//			i++;
		}
		System.out.println(factorial);

	}

}
