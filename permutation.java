import java.util.Scanner;
public class permutation {
public static void printPermutation(String str,int idx,String perm){
    if(str.length()==0){
        System.out.println(perm);
        return;
    }
    for (int i=0;i<str.length();i++){
        char currchar=str.charAt(i);
        String newstr=str.substring(0,i)+str.substring(i+1);
        printPermutation(newstr,idx+1,perm+currchar);
    }
}

    public static void main(String[] args) {
        String str="abc";
        printPermutation(str,0," ");
    }
}
