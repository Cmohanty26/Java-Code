package com.Condition;
import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st no");
		int x=sc.nextInt();
		System.out.println("Enter the 2nd no");
		int y=sc.nextInt();
		if(x>y) {
			System.out.println("x is greater");
		}
		else {
			System.out.println("y is greater");
		}
		

	}

}
