package Method.com;

public class Example3 {
	static void change(int[] arr) {
		arr[0]=98;
	}

	public static void main(String[] args) {
		int[] marks= {30,78,89,45,80};
		
		change(marks);
		System.out.println("The changing value is:"+marks[0]);

	}

}

