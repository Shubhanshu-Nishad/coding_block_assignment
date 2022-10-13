import java.util.*;
public class Main {
	public static void Replace_all_0_with_5(int n,int ans,int count){
		if(n<=0){
			System.out.println(ans);
			return;
		}
		int digit = n%10;
		if(digit!=0)
			Replace_all_0_with_5(n/10,ans+(digit*((int)Math.pow(10,count))),count+1);
		else
			Replace_all_0_with_5(n/10,ans+(5*((int)Math.pow(10,count))),count+1);
		
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int ans = 0;
		Replace_all_0_with_5(n,ans,0);
    }
}
// https://hack.codingblocks.com/app/contests/3553/2041/problem
