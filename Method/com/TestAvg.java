package Method.com;

public class TestAvg {

	public static void main(String[] args) {
	Average a=new Average();
	float result=a.m2(32, 10, 20);
	System.out.println("The average of three number is:"+result);

	}

}
class Average{
	public float m2(int i,int j,int k) {
		float total=(i+j+k);
		float Avg=(total)/3;
		return Avg;
	}
}
