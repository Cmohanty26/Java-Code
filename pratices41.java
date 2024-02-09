public class pratices41 {
    public static void main(String[] args) {
        float[]marks={43.7f,58.9f,56.0f,90.6f,32.5f};
        float sum=0;
        for (float element:marks){
            sum=sum+element;
        }
        System.out.println("The  value of average marks is :"+sum/marks.length);
    }
}
