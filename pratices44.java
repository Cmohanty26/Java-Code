public class pratices44 {
    public static void main(String[] args) {
        int[]arr={1,2100,2,455,34,565};
        int max=Integer.MIN_VALUE;
        for (int e:arr){
            if(e<max){
                max=e;

            }
        }
        System.out.println("The value of the maximum element in this array is:"+max);
    }
}
