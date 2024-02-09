public class practice115 {//bubble sort
public static void PrintArray(int[]arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
    int[]arr={30,3,7,8,89,90,2};
    for (int i=0;i< arr.length-1;i++){
        boolean swap=false;
     for (int j=0;j< arr.length-i-1;j++){
         if (arr[j]>=arr[j+1]){
             int temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
             swap=true;
         }
     }
     if (swap==false)
         break;
    }
    PrintArray(arr);

    }
}
