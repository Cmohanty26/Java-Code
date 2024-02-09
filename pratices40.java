public class pratices40 {
    public static void main(String[] args) {
        float[]marks={45.7f,98.6f,54.6f,90.1f,78.3f};
        float num=88.79f;
        boolean isInArray=false;
        for (float element:marks){
            isInArray=true;
            break;
        }
        if (isInArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }
    }
}
