package Array.com;

public class Example1 {

	public static void main(String[] args) {
		int[] marks= {10,45,78,89,50};
		int num=78;
		boolean isInArray=false;
//		int sum=0;
		for(int element:marks) {
			if(num==element) {
				isInArray=true;
				break;
			}
//			sum+=element;
		}
		if(isInArray) {
			System.out.println("The element is present in the array");
		}
		else {
			System.out.println("The value is not present");
		}

//			System.out.println("The sum of marks is:"+sum);
		
	}

}
