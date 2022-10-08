import java.util.*;
public class Main {
	public static int Nth_Triangle_Recursion(int n,int ans){

		if(n==0){
			System.out.println(ans);
			return n;
		}
		ans +=n;
		return Nth_Triangle_Recursion(n-1,ans);
		
			
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans=0;
		Nth_Triangle_Recursion(n,ans);
    }
}

// https://hack.codingblocks.com/app/contests/3553/240/problem
