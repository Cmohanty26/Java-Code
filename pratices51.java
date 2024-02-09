public class pratices51 {
    static float fahrenheit(float cel){
        float fahren=(cel*(9/5.0f))+32.0f;
        return fahren;
    }

    public static void main(String[] args) {
        float celsius=15.7f;
        System.out.println(celsius+"c"+"->"+fahrenheit(celsius)+"f");
    }
}
