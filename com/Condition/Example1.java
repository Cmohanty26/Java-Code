package com.Condition;
import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		if(marks>=90) {
			System.out.println("The grade is A");
			
		}
		else if(marks>=70 && marks<90) {
			System.out.println("The grade is B");
		}
		else if(marks>=50 && marks<70) {
			System.out.println("The grade is C");
		}
		else if(marks>=35 && marks<50) {
			System.out.println("The grade is D");
		}
		else {
			System.out.println("The grade is F");
		}

	}

}
