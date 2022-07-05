import java.util.*;
public class decryption
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String r=" ";
		for(int i=0;i<s.length();i++){
		    if(i%2!=0){
		        int j=(s.charAt(i))-48;
		        while(j>0)
		        {
		            r=r+(s.charAt(i-1));
		            j--;
		        }
		    }
		}
		int n=sc.nextInt();
		System.out.println(r.charAt(n-1));
	}
}