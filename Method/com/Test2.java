package Method.com;

public class Test2 {

	public static void main(String[] args) {
		Doctor d=new Doctor();
		String place=d.Hospital(10,3.14f);
		System.out.println("The name of the place is:"+place);
		System.out.println("The name of the doctor is:" + d.name);
		System.out.println("The experience is:"+d.experience);
		System.out.println("The gender is:"+ d.gender);
		System.out.println("The availability is:"+d.availabity);
		

	}

}
class  Doctor{
	public String name="Vinod";
	public int experience=10;
	public char gender='M';
	public boolean availabity=true;
	public String Hospital(int a,float b) {
		String place="Banglore";
		return place;
	}
}
