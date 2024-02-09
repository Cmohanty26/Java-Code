import java.util.Scanner;

public class pratices48 {
    float average(float...arr){
        float total=0;
        for (float element:arr){
            total+=element;
        }
        float avg=total/ arr.length;
        return  avg;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers you want to pass?:");
        int a= sc.nextInt();
        float[]arr=new float[a];
        for (int i=0;i<a;i++){
            System.out.println("Enter the element"+(i+1)+"is:");
            float el= sc.nextFloat();
            arr[i]=el;
        }
        pratices48 obj=new pratices48();
        System.out.println("Average is:"+obj.average(arr));

    }
}
