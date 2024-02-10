package com.Condition;

public class MyProgram {

	public static void main(String[] args) {
		Day d=new Day();
		String dayname=d.getDayname(10);
		System.out.println("The day name is:"+ dayname);
	}

}
class Day{
	public String getDayname(int num) {
		if(num==1) { 
			return "Monday";
		}
		else if(num ==2) {
			return "Tuesday";
		}
		else if(num==3) {
			return "Wednesday";
		}
		else if(num==4) {
			return "Thursday";
		}
		else if(num==5) {
			return "Friday";
		}
		else if(num==6) {
			return "Saturday";
		}
		else if(num==7) {
			return "Sunday";
		}
		
		else {
			
			return "it is not a day ";
		}
		
	}
}
