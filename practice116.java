public class practice116 {//Quicksort
    public static int partition(int[]arr,int low,int high){
        int pivot=arr[high];
        int swapIndex=low-1;
        for (int j=low;j<high;j++){
            //if the current element is smaller than the pivot
            if (arr[j]<pivot){
                swapIndex++;
                //swap arr[i] and arr[j]
                int temp=arr[swapIndex];
                arr[swapIndex]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[swapIndex+1];
        arr[swapIndex+1]=arr[high];
        arr[high]=temp;
        return swapIndex+1;

    }
    public static void Quicksort(int[]arr,int low,int high){
        if (low<high){
            int indexPi=partition(arr,low,high);
            Quicksort(arr,low,indexPi-1);
            Quicksort(arr,indexPi+1,high);
            }
        }

    public static void main(String[] args) {
        int[]arr={70,90,10,30,50,20,60};
        int n= arr.length;
        Quicksort(arr,0,n-1);
        for (int i=0;i<n;i++)
            System.out.println(arr[i]+" ");

    }
}
