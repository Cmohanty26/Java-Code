public class Test5 {
    public static void main(String[] args) {
        int x[][]=new int[2][];
        x[0]=new int[2];
        x[1]=new int[3];
        //store 2 element into first array
        x[0][0]=10;
        x[0][1]=11;
        //store 3 element into second array
        x[1][0]=12;
        x[1][1]=13;
        x[1][2]=14;
        //display first array
        for (int i=0;i<3;i++)
            System.out.println(x[1][i]+" . ");
    }
}
