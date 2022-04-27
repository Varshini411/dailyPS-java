import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int a[]=new int[26];
        char[] arr=s.toCharArray();
        int n=0,flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != ' '){
                n=arr[i]-97;
                a[n]=1;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i] != 1){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("pangram");
        }
        else{
            System.out.println("not a pangram");
        }
    }
}
