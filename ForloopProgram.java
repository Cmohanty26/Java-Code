public class ForloopProgram {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            Squarecircle(i);
        }
        for (int i=1;i<=10;i++){
            Multitable(i);
        }
        for (int i=10;i>=1;i--){
            Multitable2(i);
        }
    }
    public static void Squarecircle(int i){
        int j=i*i;
        System.out.println("The square of "+ i + " is:" + j);
    }
    public static void Multitable(int i){
        int j=7*i;
        System.out.println(j);
    }
    public static void Multitable2(int i){
        int j=8*i;
        System.out.println(j);

    }
}
