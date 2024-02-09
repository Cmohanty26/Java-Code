package com.BreakandContinue;

public class Example1 {

	public static void main(String[] args) {
		for(int i=0;i<=20;i++) {
			if(i==4) {
				System.out.println("Ending the loop");
				continue;
			}
		
		System.out.println(i);
		System.out.println(" it is run");
		}
	}

}
